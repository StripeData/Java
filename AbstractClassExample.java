package com.company;

abstract class AbstractSamp1{
    void display(){
        System.out.println("This is from display");
    }
    abstract void show();
}
public class AbstractClassExample extends AbstractSamp1 {
    public void show(){
        System.out.println("from show child class");
    }
    public static void main(String[] args) {
        AbstractSamp1 obj = new AbstractClassExample();
        obj.show();
        obj.display();
    }
}