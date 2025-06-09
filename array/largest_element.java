import java.util.*;
public class largest_element {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,87,42,54,23,6,43,90,23};
        System.out.println("largest element of array is "+largest(arr));
    }
}
