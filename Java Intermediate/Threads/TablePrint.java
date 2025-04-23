class Table1 extends Thread{
    int num;
    Table1(int num){
        this.num = num;
    }
    public void run(){
        try{
            for(int i=1; i<=10; i++){
            System.out.println(num +"*"+i+" = "+ (num*i) +"Thread isAlive:"+isAlive());
            if(i==3){
                stop();
            }
            Thread.sleep(660);
            }
        }catch(Exception ex){
            System.out.println("Exception occures.");
        }
    }
}

class Table2 extends Thread{
    int num;
    Table2(int num){
        this.num = num;
    }
    public void run(){
        try{
            for(int i=1; i<=10; i++){
            System.out.println(num +"*"+i+" = "+ (num*i) );
            Thread.sleep(1000);
            }
        }catch(Exception ex){
            System.out.println("Exception occures.");
        }
    }
}

public class TablePrint{
    public static void main(String args[]) throws Exception{
        Table1 t1 = new Table1(5);
        t1.start();
        t1.join();
        System.out.println(t1.isAlive());
        Table2 t2 = new Table2(10);
        t2.start();
    }
}