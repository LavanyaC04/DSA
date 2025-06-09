public class binomial_coefficient {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bino_coe(int n,int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int n_r_fact=fact(n-r);
        int bc=n_fact/(r_fact*n_r_fact);
        return bc;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int ncr=bino_coe(n, r);
        System.out.println(ncr);
    }
}
