public class Overloading {

    public int area(int l, int b)
    {
       System.out.println("Area of rectangle is: ");
        return (l*b);
    }

    public int area (int l){
        System.out.println("Area of Square is");
        return(l*l);
    }

    
    public static void main(String[] args) {
        Overloading s = new Overloading();
        System.out.println(s.area(5, 6));
        System.out.println(s.area(5));


    }
    
}
