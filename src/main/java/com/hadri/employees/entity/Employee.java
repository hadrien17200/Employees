package com.hadri.employees.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "employees_junia01")
public class Employee {
    @Id
    @Column(name = "emp_no", nullable = false)
    private Integer empNo;

    @Column(name = "first_name", nullable = false, length = 14)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 16)
    private String lastName;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "salary", nullable = false)
    private Integer salary;

    @Column(name = "dept_no", nullable = false, length = 4)
    private String deptNo;

}