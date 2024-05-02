package org.example;

public class Alien {
    Alien(){
        System.out.println("Alien object created");
    }
    Alien(int age , Computer lap){
        System.out.println("para cons called");
        this.age=age;
        this.com=lap;
    }
    private int age;
    private Computer com;
    public int getAge() {
        return age;
    }

    public void setAge(int age){
        System.out.println("age setter is called");
        this.age=age;
    }
//    private Laptop lap;


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("coding.....!");
        com.compile();
    }
}
