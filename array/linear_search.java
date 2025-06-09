public class linear_search {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,4,9,3,8};
        int key=9;
        System.out.println(linear(arr, key));
    }
}
