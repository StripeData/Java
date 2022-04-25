public class ObjectSample {
    float weight;
    float height;
    int age;
    String name;

    public static void main(String[] args) {
        ObjectSample p1 = new ObjectSample();
        p1.weight=63.0f;
        p1.height =5.7f;
        p1.age =33;
        p1.name = "Dasari";

        ObjectSample p2 = new ObjectSample();
        p2.weight=23.0f;
        p2.height= 2.6f;
        p2.age = 4;
        p2.name="chaalisa";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.weight);

        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);
        System.out.println(p2.weight);



    }


}
