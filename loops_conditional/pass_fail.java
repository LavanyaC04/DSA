import java.util.*;
public class pass_fail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks:");
        int marks=sc.nextInt();
        String result=(marks>=35)?"pass":"fail";
        System.out.print("result is "+result);
    }
    
}
