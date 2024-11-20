package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update (Order order) {

        Session session = factory.openSession();
        session.getTransaction().begin();
        try{
            session.merge(order);
            session.getTransaction().commit();
        } catch(Exception e){
            session.getTransaction().rollback();
        }
        session.close();

    }

    public void create (Order order) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        session.persist(order);

        session.getTransaction().commit();

        session.close();

    }

    public void delete (Order order) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        session.delete(order);

        session.getTransaction().commit();

        session.close();

    }

    public Order findById(int id) {

        String hqlQuery = "SELECT o FROM Order o WHERE o.id = :orderId";

        Session session = factory.openSession();

        TypedQuery<Order> query = session.createQuery(hqlQuery, Order.class);

        query.setParameter("orderId", id);

        try {
            Order result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }

    }







}
