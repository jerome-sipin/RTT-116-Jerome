package com.example.module309.database.dao;

import com.example.module309.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.id = :id")
    List<Employee> findByEmployeeId(Long id);

}
