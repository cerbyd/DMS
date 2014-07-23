package dao;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import dto.CustomerDto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.Customer;
import ninja.jpa.UnitOfWork;

/**
 *
 */
public class CustomerDao {

    @Inject
    private Provider<EntityManager> entitiyManagerProvider;

    @UnitOfWork
    public List<Customer> getAll() {
        EntityManager entityManager = entitiyManagerProvider.get();
        TypedQuery<Customer> query = entityManager.createQuery("SELECT x FROM Customer x", Customer.class);
        return query.getResultList();
    }

    @Transactional
    public boolean createCustomer(CustomerDto customerDto) {

        EntityManager entityManager = entitiyManagerProvider.get();

        Customer customer = new Customer();
        customer.setReference(customerDto.reference);
        entityManager.persist(customer);

        return true;

    }

    @Transactional
    public void delete(String reference) {
        EntityManager entityManager = entitiyManagerProvider.get();
        Query q = entityManager.createQuery("DELETE FROM Customer x WHERE x.reference = :reference");
        q.setParameter("reference", reference).executeUpdate();
    }
}
