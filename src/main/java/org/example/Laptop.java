package org.example;

public class Laptop implements Computer {
//    Laptop()
//    {
//        System.out.println("laptop object created");
//    }
    @Override
    public void  compile()
    {
        System.out.println("compiling using laptop");
    }
}
