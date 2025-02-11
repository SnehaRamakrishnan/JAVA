import java.util.Scanner;
public class Fib { 
    public static int fibn(int a,int b) {
        int c=a+b;
        return c;
      }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("N?");
      int n=sc.nextInt();
      int a=0,b=1;

        System.out.println("fib series:");
        for( int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=fibn(a,b);
            a=b;
            b=c;
        }
    }

      }
    
