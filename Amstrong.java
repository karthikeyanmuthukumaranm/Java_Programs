import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int original =num, sum=0;
        
        while(num>0){
            int digit = num%10;
            sum+=digit*digit*digit;
            num =num/10;

        }
        if (original==sum){
            System.out.println(sum+" is an Amstrong");
        }else{
            System.out.println(sum+" is not Amstrong Number");
        }
        sc.close();
    }
}
