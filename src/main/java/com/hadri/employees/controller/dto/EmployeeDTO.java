package com.hadri.employees.controller.dto;

public record EmployeeDTO(int empNo,
                          String firstName,
                          String lastName,
                          String title,
                          int salary,
                          String deptNo) {
}
