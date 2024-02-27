import java.util.*;
import java.util.Collections;
import java.util.Arrays;
public class SortBuilt {
    public static void main(String args[]){
        Integer arr[] = {5,2,8,15,20,10};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        
    }
    
}
