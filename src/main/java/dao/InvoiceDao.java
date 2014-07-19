package dao;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import dto.InvoiceDto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.Invoice;
import ninja.jpa.UnitOfWork;

/**
 *
 */
public class InvoiceDao {

    @Inject
    private Provider<EntityManager> entitiyManagerProvider;

    @Transactional
    public boolean createInvoice(InvoiceDto invoiceDto) {

        EntityManager entityManager = entitiyManagerProvider.get();

        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber(invoiceDto.invoiceNumber);
        entityManager.persist(invoice);

        return true;

    }

    @UnitOfWork
    public List<Invoice> getAll() {
        EntityManager entityManager = entitiyManagerProvider.get();
        TypedQuery<Invoice> query = entityManager.createQuery("SELECT x FROM Invoice x", Invoice.class);
        return query.getResultList();
    }

    @UnitOfWork
    public Invoice getInvoice(String invoiceNumber) {
        EntityManager entityManager = entitiyManagerProvider.get();
        TypedQuery<Invoice> q = entityManager.createQuery("SELECT x FROM Invoice x WHERE x.invoiceNumber = :invoiceNumber", Invoice.class);
        List<Invoice> matchingInvoices = q.setParameter("invoiceNumber", invoiceNumber).getResultList();

        if (matchingInvoices.size() == 1) {
            return matchingInvoices.get(0);
        }

        return null;
    }

    @Transactional
    public void delete(String invoiceNumber) {
        EntityManager entityManager = entitiyManagerProvider.get();
        Query q = entityManager.createQuery("DELETE FROM Invoice x WHERE x.invoiceNumber = :invoiceNumber");
        q.setParameter("invoiceNumber", invoiceNumber).executeUpdate();
    }
}
