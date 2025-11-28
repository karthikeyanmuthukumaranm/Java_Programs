import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of A : ");
        int a =sc.nextInt();
        System.out.println("Enter value of B :");
        int b = sc.nextInt();

        int temp =a;
        a=b;
        b=temp;

        System.out.println("after swap A: "+a);
        System.out.println("after swap B: "+b);
        sc.close();
    }
}
