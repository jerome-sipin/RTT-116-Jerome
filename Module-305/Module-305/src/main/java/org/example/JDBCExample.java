package org.example;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/first_schema";
        String user = "root";
        String password = "tingaspingas";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);

            // these 3 lines of code are using a regular statement to execute the query
//            String SelectSQL = "Select * FROM employees";
//            Statement stmt = connection.createStatement();
//            ResultSet result =  stmt.executeQuery(SelectSQL);

            // when we have variables we want to use a PreparedStatement
            // in general, we want to use a PreparedStatement for everything!!! as a best practice
            // if you will recall, this is a protection against SQL injection attacks.
            String selectSQL = "select * from employees where id = ?";
            PreparedStatement stmt = connection.prepareStatement(selectSQL);
            stmt.setInt(1, 1056);
            ResultSet result = stmt.executeQuery();
            // Statement stmt = connection.createStatement()
            // ResultSet result = stmt.executeQuery(SelectSQL)



            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
