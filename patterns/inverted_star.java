public class inverted_star {
    public static void main(String[] args) {
        for(int line=4;line>=1;line++){
            for(int star=4;star>=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
