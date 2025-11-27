import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");

        int num = sc.nextInt();

        if (num%2==0){
            System.out.println(num+"even number");

        }else{
            System.out.println(num+"odd number");
        }
        sc.close();
    }
}
