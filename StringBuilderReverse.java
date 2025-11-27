import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class StringBuilderReverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String Reverse = new StringBuilder(str).reverse().toString();
        System.out.println(Reverse);
        sc.close();
    }
}
