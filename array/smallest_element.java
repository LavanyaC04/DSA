public class smallest_element {
    public static int smallest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,87,42,54,23,6,43,90,23};
        System.out.println("smallest element of array is "+smallest(arr));
    }
}
