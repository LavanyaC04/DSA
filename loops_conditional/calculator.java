import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter operator:");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':System.out.println("addition of "+a+" and "+b+" is "+(a+b));
                     break;
            case '-':System.out.println("substraction of "+a+" and "+b+" is "+(a-b));
                     break;
            case '*':System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
                     break;
            case '/':System.out.println("division of "+a+" and "+b+" is "+(a/b));
                     break;
            case '%':System.out.println("remainder of "+a+" and "+b+" is "+(a%b));
                     break;
            default:System.out.println("incorrect opertor");
        }

    }
}
