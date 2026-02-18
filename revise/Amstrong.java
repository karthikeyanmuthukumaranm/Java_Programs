package revise;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0, original = num;

        while(num>0){
            int digit = num%10;
            sum += digit*digit*digit;
            num = num/10;
        }
        if(original == sum){
            System.out.println(sum+"eqauals "+ original);
        }else{
            System.out.println("Not");
        }
        sc.close();
    }
}
