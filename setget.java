package com.company;

public class setget {
    private float weight;
    private float height;
    private int age;
    private String name;

    public setget(){
        this.height = 5.5f;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        setget p1 = new setget();
        p1.setAge(35);
        p1.setName("Harshada");

        p1.setWeight(55.0f);

        setget p2 = new setget();
        p2.setAge(26);
        p2.setName("chhavi");

        p2.setWeight(50.0f);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getWeight());
        System.out.println(p1.getHeight());

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getWeight());
        System.out.println(p2.getHeight());


    }
}