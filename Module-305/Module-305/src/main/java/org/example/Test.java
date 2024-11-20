package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Employee;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

public class Test {

    public static void main( String[] args) {

//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        Employee e = employeeDAO.findById(1501);
//        System.out.println(e);

        ProductDAO productDAO = new ProductDAO();
        OrderDAO orderDAO = new OrderDAO();
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

        Order o = orderDAO.findById(10100);
        Product p = productDAO.findById(1);


        OrderDetail od = orderDetailDAO.findByOrderIdAndProductId(o.getId(), p.getId());

        if ( od == null ){
            od = new OrderDetail();
            // this is a create because the combination of orderid and productid was not found in the database
            // we can create it
            od.setOrderId(o.getId());
            od.setProductId(p.getId());
            od.setQuantityOrdered(100);
            od.setPriceEach(1.99);
            od.setOrderLineNumber(1);

            orderDetailDAO.create(od);
        } else {
            // this is the case where the item already exists as part of the order
            od.setQuantityOrdered(od.getQuantityOrdered() + 100);
            orderDetailDAO.update(od);
        }

        System.out.println(o);
        System.out.println(p);

    }
}
