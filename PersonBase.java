package org.day2;

public class PersonBase {
    private int id;
    private String name;

    public PersonBase(int id, String name){
        this.id=id;
        this.name=name;
    }

   void showDetails(){
       System.out.println("parent class");
       System.out.println("Good Night "+"id = "+id+" name = "+name);
    }
}
