public class thread  extends Thread{
    @Override
    public void run(){
        for(int i =1; i<= 10 ; i++){
            System.out.println("Thread :"+i);
        }
    }
    

}

class ThreadMain{
   public static void main(String[] args) {
       thread t = new thread();
       t.run();
   }
}
