public class hollow_rectangle {
    public static void main(String[] args) {
        int totrow=6;
        int totcol=10;
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
