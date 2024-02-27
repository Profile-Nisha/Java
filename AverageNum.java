import java.util.*;
public class AverageNum {
    public static int average(int a, int b, int c){
       return (a + b + c) / 3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a");
        int a = sc.nextInt();
        System.out.println("enter the number b");
        int b = sc.nextInt();
        System.out.println("enter the number c");
        int c = sc.nextInt();
        System.out.println( "average numnber" + "= "  + average(a, b, c))  ;  
    }
    
}
