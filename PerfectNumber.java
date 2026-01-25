import java.util.Scanner;

public class PerfectNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int digit = num %10;
            int fact =1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
        }
        sum = sum +fact;
        num = num/10;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }
    

       if(sum==original){
        System.out.println("Strong");
       }else{
        System.out.println("not strong");
       }
       sc.close();
}
}