public class EqualArray {
    public  static void EqualArray(int arr1[], int arr2[]){
        for(int i =0; i< arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println("equal number in array :" + arr1[i]);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr1[] = {10,5,20,50,25,100};
        int arr2[] = {50,10,70,20,2,200,100};
        EqualArray(arr1, arr2);
    }
    
}
