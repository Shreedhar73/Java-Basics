class Shape {
   

    public  void areaofSquare(int length){
        System.out.println("Area of Square is: " + length *length);
        
        
    }

    public void areaofRect(int length, int breadth ){
        System.out.println("Area of Rectangle is: " + length * breadth);
    }
     
    public void areaofTri(int base, int height){
        System.out.println("Area of triangle is: " + (base *height / 2));
        
    }
    public void areaofCircle(int radius){
        System.out.println("Area of Circle is " +(radius *radius * 22 / 7));
       
        
    }

}
 class Calculate {
     public static void main(String[] args) {

        Shape shape = new Shape();
        shape.areaofSquare(5);
        shape.areaofRect(10, 6);
        shape.areaofTri(12, 8);
        shape.areaofCircle(6);
         
     }
 }
