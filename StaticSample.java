public class StaticSample {
    static int a;
    int a2;
    // in static function u can use only static variable
    static void show(){
        StaticSample obj = new StaticSample();
        obj.a2 = 6;
        a=9;
    //    a2=7;
        System.out.println("from static function");
    }
        public static void main(String[] args) {
        StaticSample obj = new StaticSample();
        obj.show();
        show();
        StaticSample.show();
        obj.a = 3;
        obj.a2 = 8;
        StaticSample obj2 = new StaticSample();
        obj2.a = 7;
        obj2.a2 = 5;
        System.out.println(obj.a);
        System.out.println(obj.a2);
        System.out.println(obj2.a);
        System.out.println(obj2.a2);
        System.out.println(StaticSample.a);
    }
}
