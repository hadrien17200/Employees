package com.hadri.employees.repository;

import com.hadri.employees.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();

    Optional<Employee> findByEmp_no(Integer Emp_no);
}
