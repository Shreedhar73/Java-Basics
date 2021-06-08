interface IShape{
    void area(int length, int breadth);
    void volume(int length, int breadth, int height);
}

class  Rectangle implements IShape{
    int area;
    int volume;


    @Override
    public void area(int length, int breadth){
        area = length * breadth;

    }

    @Override
    public void volume(int a, int b, int c) {
        volume = a*b*c;
        
    }

    public void printStates(){
        System.out.println("Area of Rectangle is: " + area + " and The volume is :" + volume );
    }

}






class Calculate1{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.area(5,10);
        rect.volume(2,4,6);
        rect.printStates();
    }
}
