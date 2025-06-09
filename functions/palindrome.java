public class palindrome {
    public static void check_palindrome(int n){
        int palindrome=n;
        int reverse=0;
        while(palindrome>0){
            int rem=palindrome%10;
            reverse=reverse*10+rem;
            palindrome=palindrome/10;
        }
        if(n==reverse){
            System.out.println(n+" is a palindrome");
        }
        else{
            System.out.println(n+" is not a palindrome");
        }
    }
    public static void main(String[] args) {
        check_palindrome(121);
        check_palindrome(324);
    }
}
