public class runnableThread implements Runnable {
    @Override
    public void run(){
        System.out.println("end");
    }

    public static void main(String[] args) {
        runnableThread r = new runnableThread();
        Thread t = new Thread(r);
        t.run();
    }
    
}
