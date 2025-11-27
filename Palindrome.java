import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();

        if(str.equals(reverse)){
            System.out.println(str+" is an Palindrome");
        }else{
            System.out.print(str+" not palindrome");
        }
        sc.close();
    }
}
