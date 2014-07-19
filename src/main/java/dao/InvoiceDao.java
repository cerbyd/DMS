package dao;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import dto.InvoiceDto;
import javax.persistence.EntityManager;
import models.Invoice;

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
        entityManager.persist(invoice);

        return true;

    }
}
