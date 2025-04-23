class MyTable  {
    // int num;
    // MyTable(int num){
    //     this.num = num;
    // }

     synchronized  void showTable(int num){
        try{
            for(int i=1; i<=10; i++){
            System.out.println(num + "*"+i+" = "+(num*i));
            // System.out.println(num + "*"+i+" = "+(num*i));
            Thread.sleep(200);
            }
        }catch(Exception ex){
            System.out.println("Exception occured");
        }
    }
}

class Table5 extends Thread{
    MyTable mt;
    public void setTable(MyTable mt){
        this.mt = mt;
    }
    public void run(){
        // int min = 2;
        // int max = 8;
        // int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        // mt = new MyTable(5);
        mt.showTable(5);
    }
}

class Table6 extends Thread{
    MyTable mt;
    public void setTable(MyTable mt){
        this.mt = mt;
    }
    public void run(){
        // mt = new MyTable(6);
        mt.showTable(6);
    }
}

public class SynchronizedTable{
    public static void main(String args[]){
        MyTable mt = new MyTable();

        Table5 t5 = new Table5();
        t5.setTable(mt);
        t5.start();
        // t5.join();
        Table6 t6 = new Table6();
        t6.setTable(mt);
        t6.start();
    }
}