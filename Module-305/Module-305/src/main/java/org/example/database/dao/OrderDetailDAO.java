package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDetailDAO {


    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update (OrderDetail orderDetail) {

        Session session = factory.openSession();
        session.getTransaction().begin();
        try{
            session.merge(orderDetail);
            session.getTransaction().commit();
        } catch(Exception e){
            session.getTransaction().rollback();
        }
        session.close();

    }

    public void create (OrderDetail orderDetail) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(orderDetail);
        session.getTransaction().commit();

    }

    public OrderDetail findByOrderIdAndProductId(int orderId, int productId) {
        Session session = factory.openSession();

        String hql = "SELECT od FROM OrderDetail od WHERE od.orderId = :orderId AND od.productId = :productId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("orderId", orderId);
        query.setParameter("productId", productId);

        try{
            OrderDetail orderDetail = query.getSingleResult();
            return orderDetail;
        } catch (Exception e){
            return null;
        } finally {
            session.close();
        }
    }

    public void delete (OrderDetail orderDetail) {

        Session session = factory.openSession();

        session.getTransaction().begin();

        session.delete(orderDetail);

        session.getTransaction().commit();

        session.close();

    }

    public OrderDetail findById(int id) {

        String hqlQuery = "SELECT od FROM OrderDetail od WHERE od.id=:orderDetailId";

        Session session = factory.openSession();

        TypedQuery<OrderDetail> query = session.createQuery(hqlQuery, OrderDetail.class);

        query.setParameter("orderDetailId", id);

        try {
            OrderDetail result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }

    }

}
