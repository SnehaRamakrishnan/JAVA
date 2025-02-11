import java.util.Scanner;
public class Prime {

    public void checkPrime(int num){
        int flag=0;
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(num+"is a prime");
            }else{
                    System.out.println(num+"is not a prime");
                }
            }
            }
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int num=sc.nextInt();
        Prime obj=new Prime();
        obj.checkPrime(num);
        

        }
        
    }

