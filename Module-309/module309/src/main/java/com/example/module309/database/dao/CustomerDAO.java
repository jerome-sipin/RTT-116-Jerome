package com.example.module309.database.dao;

import com.example.module309.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Customer = entity we are working with
// Long = primary key data type
public interface CustomerDAO extends JpaRepository<Customer, Long> {

    @Query("select c from Customer c where c.contactFirstname = :firstName")
    List<Customer> findByFirstName(String firstName);

    // you can only do customer things in these DAOs.

    // this works even with no SQL? wtf lol
    //List<Customer> findbyContactLastName(String contactLastName);
}
