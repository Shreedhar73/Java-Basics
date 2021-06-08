

public class overriding {
    void print(){
        System.out.println("BASE CLASS");
    }
    

}
class child extends overriding{
    @Override
    void print(){
        System.out.println("OverRidded Class");
    }
}

class Main{
    public static void main(String[] args) {
        overriding obj1 = new overriding();
        obj1.print();

        overriding obj2 = new child();
        obj2.print();
    }
}
