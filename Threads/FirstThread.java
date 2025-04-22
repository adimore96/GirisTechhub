class MyThread extends Thread{
    public void run(){
        System.out.println("Thread 1 is Running");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Thread 2 is running!");
    }
}
public class FirstThread{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }
}