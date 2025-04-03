package com.example;

import com.example.dao.DAO;
import com.example.dao.impl.DAOimpl;
import com.example.entity.Department;
import com.example.entity.Employee;

public class Main {


    public static void main(String[] args) {
        DAO dao = new DAOimpl();

        Department department = Department.builder().
                departmentId(1).
                departmentName("Accounts").
                departmentHead("Ramesh").
                departmentDescription("AccountsDept").
                build();
        System.out.println("Department details is stored in database");
        dao.storeDepartmentDetails(new Department(1, "Accounts", "Ramesh", "Account Dept"));
        dao.storeDepartmentDetails(new Department(2, "Admin", "Vijay", "Admin Dept"));
        dao.storeDepartmentDetails(new Department(3, "Sales", "Vinod", "Sales Dept"));
        dao.storeDepartmentDetails(new Department(4, "HR", "Mahesh", "HR Dept"));


        Employee employee = Employee.builder().
                employeeId(1).
                employeeName("Ramesh").
                employeeSalary(12000.00).
                employeeAddress("Address1").
                employeeContactNo(9878781212L).
                departmentId(2).
                build();
        dao.storeEmployeeDetails(new Employee(87, "Vikram", 12000.0, "Address1",9878761212L , 2));
        dao.storeEmployeeDetails(new Employee(110, "Ajay", 18000.0, "Address2", 9654377643L, 1));
        dao.storeEmployeeDetails(new Employee(98, "Rajesh", 11000.0, "Address3", 9965322212L, 4));
        dao.storeEmployeeDetails(new Employee(67, "Ram", 19000.0, "Address4", 8078343732L, 3));
        dao.storeEmployeeDetails(new Employee(45, "Vimal", 27000.0, "Address5", 9932113221L, 4));
        dao.storeEmployeeDetails(new Employee(987, "Kiran", 21000.0, "Address6", 7076337238L, 2));


        System.out.println("Employee details is stored in database");


        dao.calculatePF(87);

    }
}
