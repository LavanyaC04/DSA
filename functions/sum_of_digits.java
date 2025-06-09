public class sum_of_digits {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=sum+last;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
    
}
