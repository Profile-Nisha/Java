import java.util.*;
public class OddorEven {
    public static boolean ifeven(int num){
        if(num % 2 == 0){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(ifeven(num));

    }
    
}
