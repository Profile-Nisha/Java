public class LinearSearch {
    public static int Linear(int arr[], int key){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,5,3,1,7,8,9};
        int key = 1;
        System.out.println(Linear(arr, key));
    }
    
}
