import java.util.Scanner;

public class Mul {
    public static void printMuln(int n) {
        for(int i=1;i<=10;i++){
        //for (int j = 1; j <= 10; j++) {
         System.out.println(n+"*"+i+"="+(n*i));
        }
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N?");
    int n=sc.nextInt();
    Mul.printMuln(n);
    //Mul obj=new Mul();
    //obj.printMuln(n);
 }
}




        
