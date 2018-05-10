package com.test.mysql.model;

import org.springframework.stereotype.Component;

@Component
public class Dept_emp {
    //关联字段emp_no
    private Employees employees;
    //关联字段 dept——no
    private Departments departments;
    private String from_date;
    private String to_date;

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }
}
