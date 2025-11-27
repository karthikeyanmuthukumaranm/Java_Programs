import java.util.Scanner;

public class Reseverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        int reverse =0;
        int original =num;

        while (num!=0){
            int digit =num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        System.out.println("Reverse of " +original+ " is "+reverse);
        sc.close();
    }
}
