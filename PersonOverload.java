package org.day2;

public class PersonOverload {
    int id,age;
    String name;

    public PersonOverload(int id, int age, String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public PersonOverload(int id, String name){
        this.id=id;
        this.name=name;
    }

    public void greet(){
        System.out.println("Good Night");
    }

    public void greet(int  id,String name){
        System.out.println("Good Night"+"id = "+id+"name = "+name);
    }

    public void greet(int id,int age,String name){
        System.out.println("Good Night"+" my is is "+id+" my age is "+age+" my name is "+name);
    }
}
