import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println(num+" is  a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
