package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    // old style: make session factory for all DAO
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update(Employee employee) {
        // for hibernate
        // update: the product has already existed to work without error
        Session session = factory.openSession();
        session.beginTransaction();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void create(Employee employee) {
        // for hibernate
        // update: the product has already existed to work without error
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteByProduct(Employee employee) {
        // for hibernate
        // update: the product has already existed to work without error
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public void deleteById(int id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, id);
        try {
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public Employee findById(int employeeId) {
        Session session = factory.openSession();

        String hqlQuery = "SELECT e FROM Employee e WHERE id = :employeeId";

        TypedQuery<Employee> query = session.createQuery(hqlQuery, Employee.class);
        query.setParameter("employeeId", employeeId);

        try {
            Employee employee = query.getSingleResult();
            return employee;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

    public List<Employee> findByFirstName(String name) {

        String hqlQuery = "SELECT e FROM Employee e WHERE e.firstname LIKE concat('%',:name,'%')";

        Session session = factory.openSession();

        TypedQuery<Employee> query = session.createQuery(hqlQuery, Employee.class);
        query.setParameter("name", name);

        // will always return a list
        try {
            List<Employee> result = query.getResultList();
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
