import java.util.*;
public class FeverOrNotFever {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int temperature = sc.nextInt();
        if(temperature > 100){
            System.out.println("you have a fever");
        }else{
            System.out.println("you dont have a fever");
        }
    }
    
}
