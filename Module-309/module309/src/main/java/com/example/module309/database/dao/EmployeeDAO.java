package com.example.module309.database.dao;

import com.example.module309.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    Employee findById(Integer id);

    // this is a JPA / HQL / Hibernate / whatever query
    @Query("select e from Employee e where e.firstname = :firstName")
    List<Employee> findByFirstName(String firstName);

    // this is a native query
    @Query(value = "select * from employees order by lastname asc;", nativeQuery = true)
    List<Employee> findAllEmployees();


}
