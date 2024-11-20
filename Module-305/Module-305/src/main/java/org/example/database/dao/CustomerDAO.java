package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update (Customer customer) {

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.merge(customer);
            session.getTransaction().commit();
        } catch ( Exception e ) {
            session.getTransaction().rollback();
        }

        session.close();

    }

    public Customer create(Customer customer) {
        Session session = factory.openSession();

        session.getTransaction().begin();

        session.persist(customer);

        session.getTransaction().commit();

        session.close();

        return customer;

    }

    public void delete(Customer customer) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        session.delete(customer);

        session.getTransaction().commit();

        session.close();
    }

    public Customer findCustomerById(Integer id){

        Session session = factory.openSession();

        String sql = "select * from product where id = ?";

        String hqlQuery = "SELECT c FROM Customer c WHERE c.id = :customerId";        //Hibernate Query Language

        TypedQuery<Customer> query = session.createQuery(hqlQuery, Customer.class);
        query.setParameter("customerId", id);

        try {
            Customer result = query.getSingleResult();
            return result;
        }catch (Exception e) {
            return null;

        }finally {
            session.close();
        }
    }

    public List<Customer> search(String name){

        String hqlQuery = "SELECT c FROM Customer c WHERE c.customerName LIKE concat('%',:name,'%')";

        Session session = factory.openSession();

        TypedQuery<Customer> query = session.createQuery(hqlQuery, Customer.class);
        query.setParameter("name", "%"+name+"%");

        try {
            List<Customer> result = query.getResultList();
            return result;
        } catch ( Exception e ) {
            // if an error happens
            // we should do some real error checking here
            return new ArrayList<>();
        } finally {
            session.close();
        }

    }

}
