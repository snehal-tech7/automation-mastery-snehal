package org.day2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p = new Person(1,"Snehal");
        PersonOverload personOverload = new PersonOverload(1,25,"Snehal");
        PersonOverload personOverload1 = new PersonOverload(2,"Akshu");
        personOverload.greet();
        personOverload.greet(1,"Snehal");
        personOverload1.greet(2,30,"Akshu");
        p.describe();
        System.out.println(p.describe());

        Employee emp1 = new Employee("IT",672,1,"Snehal");
        System.out.println("Details of 1st emp");
        System.out.println("Details of 2nd emp");
        System.out.println("======new program========");
        Product p1 = new Product(1,"snehal",150323,5);
        Product p2 = new Product(2,"Akshu",14278,10);
        System.out.println("p1 final price = "+p1.finalPrice());
        System.out.println("p2 final price = "+p2.finalPrice());
        emp1.showDetails();
        System.out.println("====task 4========");
        BankAccount bankAccount1 = new BankAccount(101,"Snehal",10000);
        BankAccount bankAccount2 = new BankAccount(102,"Akshu",150000);

        bankAccount1.getBalance();
        bankAccount1.deposit(500);
        bankAccount1.withdraw(120346783);
        bankAccount1.printAccountDetails();

        bankAccount2.deposit(23000);
        bankAccount2.withdraw(300);
        bankAccount2.printAccountDetails();

    }
}