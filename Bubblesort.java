public class Bubblesort{
    public static void Bubblesort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j<arr.length - 1 -i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,2,7,6,9,3};
        Bubblesort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}