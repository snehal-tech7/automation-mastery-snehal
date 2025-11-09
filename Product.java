package org.example;

public class Product {
   private int id;
   private String name;
   private double price;
   private double discountPercentage;

    public double finalPrice(){
        return price -(price* discountPercentage/100);
    }

    public Product(int id, String name, double price, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                ",finalprice=" + finalPrice() +
                '}';
    }
}
