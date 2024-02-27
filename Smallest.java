public class Smallest {
    public static int Smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,3,2,1,-4};
        System.out.println(Smallest(arr));
    }
    
}
