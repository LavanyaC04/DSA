import java.util.*;
public class product {
    public static void calculate_product (int a,int b){
        int mul=a*b;
        System.out.println(mul);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.print("product of a and b:");
        calculate_product(a, b);
    }
}
