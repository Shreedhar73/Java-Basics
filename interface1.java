interface Ia{
    final int a = 10;
    void print();
    
}

class Test implements Ia{
    public void print(){
        System.out.println("Hello, Interface");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.print();
        System.out.println(a);
    }



}
