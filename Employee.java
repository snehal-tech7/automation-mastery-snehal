package org.day2;

public class Employee extends PersonBase {
//    private int id;
//    private String name;
    private final String dept;
    private final double salary;

    public Employee(String dept,int salary,int id,String name) {
//        this.name = name;
//        this.id = id;
        super(id,name);
        this.dept = dept;
        this.salary = salary;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("This is child class");
    }
}
