class MultiTable implements Runnable{
    public void run() {
        System.out.println("multiplication");
        for(int i=1;i<=10;i++){
            System.out.println("5"+i+"="+(5*i));
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
}
class Factorial implements Runnable{
    public void run(){
        int number=36;
        System.out.println("Factorial"+number+"");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println("factor"+i);
            }
            try {
                Thread.sleep(100);
            }catch(InterruptedException E){
                E.printStackTrace();
            }
        }
      }
    }
    public class PDemo{
        public static void main(String[] args) {
            MultiTable tableTask=new MultiTable();
            Factorial factorialTask=new Factorial();
            Thread tableThread=new Thread(tableTask);
            Thread factorialThread=new Thread(factorialTask);
            tableThread.start();
            factorialThread.start();

            System.out.println("main thread continues");
            try{
                tableThread.join();
                factorialThread.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
    System.out.println("both threads are finished");
        }
}