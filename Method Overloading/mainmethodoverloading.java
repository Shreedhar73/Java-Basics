public class mainmethodoverloading{


    //void add(intx){}
  
    // Normal main()
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        mainmethodoverloading.main("1"); /// void main (String 1)

       
    }
  
    // Overloaded main methods
    public static void main(String arg1 )  //1)
    {
        System.out.println("Hi, " + arg1);
        mainmethodoverloading.main("2","3"); //void main(String 1, String 2)
       
    }
    public static void main(String arg3, String arg4)
    {
        System.out.println("Hi, " + arg3 + ", " + arg4);
    }
}

//if(i=0){.........,,  i++}