import java.util.*;
public class Repeating {
    public static int RepeatingNumber(int arr[]){
        int count=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(" "  +  arr[i] + " ");
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String args[]){
       int arr[] = {4,2,3,1,1,2,4};
       System.out.println(RepeatingNumber(arr));
    }
    
}
