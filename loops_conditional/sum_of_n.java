import java.util.*;
public class sum_of_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++; 
        }
        System.out.println("sum of "+n+" is "+sum);
    }
}
