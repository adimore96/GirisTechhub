
class MyTable extends Thread{
    int num;
    MyTable obj;

    MyTable(MyTable obj){
        this.obj = obj;
    }
    MyTable(){
        
    }

    public void setValue(int num){
        this.num = num;
    }
    public void  run(){
        // synchronized(obj){  //to avoid synchronized(obj) method you can directly call the synchronized method using same object for multiple threads
            obj.showTable(num);

        // }
        
    }

    public synchronized void showTable(int num){
        try{
            for(int i=1; i<=10; i++){
                System.out.println(num +"*"+i+" : "+i*num);
                Thread.sleep(500);
            }
        }catch(InterruptedException  e){
            System.out.println("Ex");
        }   
    }
}

public class ThreadRevision1{
    public static void main(String args[]) throws InterruptedException{
        MyTable t = new MyTable();
        MyTable t1 = new MyTable(t);
        t1.setValue(5);
        t1.start();
        
        MyTable t2 = new MyTable(t);
        t2.setValue(10);
        t2.start();
        

    }
}