package com.company;
class E{
    int a;
    void show(){
        System.out.println("from show function");
    }
    //   add(int , int)
}
public class InheritanceSample extends C {
    public void display(){
        System.out.println("from Display");
    }

    // add (int , int , int)
    public static void main(String[] args) {

//        System.out.println(args[0] + "  " + args[1]);
        E obj = new E();
        // obj.display();
        obj.show(); // This function is calling from same class no inheritance
        InheritanceSample obj1 = new InheritanceSample();
        obj1.show(); // This function is calling from super class this is inheritance
    }
}
class F extends InheritanceSample{
    public static void main(String[] args) {
        F obj = new F();
        obj.show();
        obj.display();
    }
}
