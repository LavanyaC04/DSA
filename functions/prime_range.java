public class prime_range {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primeRange(20);
    }
}


