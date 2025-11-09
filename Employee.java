package org.example;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name,String dept,int salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("id is ="+id);
        System.out.println("name is ="+name);
        System.out.println("salary is ="+salary);
        System.out.println("dept is ="+dept);
    }
}
