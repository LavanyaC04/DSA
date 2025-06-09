import java.util.*;
public class sum_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        int c;
        do{
            System.out.print("enter a number:");
            int num=sc.nextInt();
            if(num%2==0){
                even=even+num;
            }
            else{
                odd=odd+num;
            }
            System.out.print("enter 1 if u want to continue:");
            c=sc.nextInt();
        }while(c == 1);
        System.out.println("sum of even numbers:"+even);
        System.out.println("sum of odd number:"+odd);
    }
}
