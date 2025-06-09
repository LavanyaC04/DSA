import java.util.*;
public class positive_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n+" is a positive number");
        }
        else{
            System.out.println(n+" is a negative number");
        }
    }
}
