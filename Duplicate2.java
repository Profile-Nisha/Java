public class Duplicate2 {
    public static void Duplicate(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,2,5,3,5};
        Duplicate(arr);
    }
    
}
