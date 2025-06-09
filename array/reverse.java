public class reverse {
    public static void reverse_array(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={23,65,12,87,54,90,12};
        reverse_array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
