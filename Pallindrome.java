import java.util.*;
public class Pallindrome {
    public static boolean Pallindromeic(int num){
        int original = num;
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
    //    if(Pallindromeic(num)){
    //     System.out.println("number is pallindrome");
    //    }else{
    //     System.out.println("number not pallindrome");
    //    }
    System.out.println(Pallindromeic(num));

    }
    
}
