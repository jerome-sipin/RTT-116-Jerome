package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

public class Test22 {
    public static void main( String[] args) {

//        OrderDAO orderDAO = new OrderDAO();
//        Order o = orderDAO.findById(10100);
//        for (OrderDetail od : o.getOrders()){
//            System.out.println(od);
//            System.out.println(od.getProduct());
//        }

        EmployeeDAO dao = new EmployeeDAO();
        System.out.println(dao.findByFirstName("Leslie"));








    }
}
