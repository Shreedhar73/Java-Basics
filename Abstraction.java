abstract class Abstraction {
    public abstract void m1();
}
 class B extends Abstraction{
     public void m1(){
         System.out.println("Implemented Abstraction");
     }
 }

 class TestAbstract{
     public static void main(String[] args) {
         Abstraction a = new B();
         a.m1();
     }
 }

 


 
