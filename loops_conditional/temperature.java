import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a temperature:");
        int temp=sc.nextInt();
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You dont have a fever");
        }
    }
}
