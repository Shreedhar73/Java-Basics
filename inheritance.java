// Single Inheritance

class first {
    public void print1(){
        System.out.println("ONE");
    }
     
    
    
}
 
class Second extends first {
    void print2(){
        System.out.println("Two");
    }
}


//Multilevel Inheritance
class Third extends Second {
    void print3(){
        System.out.println("Three");
    }
}

//Hybrid Inheritance

class Fourth extends Second{
    void print4(){
        System.out.println("Four");
    }
}

class Main{
    public static void main(String[] args) {
        Second x = new Second();
        System.out.println("Data from Single inheritance");
        x.print1();
        x.print2();
        
        Third y = new Third();
        System.out.println("Data from MultiLevel inheritance");
        y.print1();
        y.print2();
        y.print3();

        Fourth z = new Fourth();
        System.out.println("Data from Hybrid inheritance");
        z.print1();
        z.print2();
        z.print4();

    }
}
