package com.test.mysql.model;

public class Salaries {
    //关联字段 emp_no
    private Employees employees;
    private int salary;
    private String from_date;
    private String to_data;

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_data() {
        return to_data;
    }

    public void setTo_data(String to_data) {
        this.to_data = to_data;
    }
}
