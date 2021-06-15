class Excep{
    public static void main(String[] args) {
        try{
            int a [] = new int[2];
            int data = 1000;
        }catch (Exception e){
            System.out.println( "Exception occured: " + e
            );
        }finally{
            System.out.println("FINALLY");
        }
        System.out.println("Rest of the code");
        
    }
}