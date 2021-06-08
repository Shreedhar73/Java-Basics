abstract class Abstract2 {
     abstract void method1();
     abstract void method2();
}
class x extends Abstract2{
    public void method1(){
        System.out.println("Abstraction Implemented");
    };
    public void method2(){
        System.out.println("Method 2");
    }
}


class Test2{
    public static void main(String[] args) {
        Abstract2 obj1 = new x();
        obj1.method1();
        obj1.method2();
        }
}
