public class ConstructorSample {
    ConstructorSample(){
        System.out.println("THis is from constructor");
    }
    ConstructorSample(int a){
        System.out.println("THis is from constructor"+a);

    }
    ConstructorSample(int a, float b){
        System.out.println("THis is from constructor"+(a+b));
    }

    public static void main(String[] args) {
        ConstructorSample c1 =  new ConstructorSample();
        ConstructorSample c9 =  new ConstructorSample(5);
        ConstructorSample c3 =  new ConstructorSample(5,7.8f);
    }
}
