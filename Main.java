package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"snehal","IT",672);
        Employee emp2 = new Employee(2,"Akshu","com",500);
        System.out.println("Details of 1st emp");
        emp1.printDetails();
        System.out.println("Details of 2nd emp");
        emp2.printDetails();
        System.out.println("======new program========");
        Product p1 = new Product(1,"snehal",150323,5);
        Product p2 = new Product(2,"Akshu",14278,10);
        System.out.println("p1 final price = "+p1.finalPrice());
        System.out.println("p2 final price = "+p2.finalPrice());

    }
}