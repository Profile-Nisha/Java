public class Duplicate {
    public static void DuplicateNum(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {2,3,2,2,5,2,3,5};
        DuplicateNum(arr);
    }
    
}
