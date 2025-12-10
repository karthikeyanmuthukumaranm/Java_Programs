import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Celcius Value : ");
        int c = sc.nextInt();

        int f = (c * 9/5)+32;
        System.out.println("Fahrenheit value is : "+f);

        sc.close();
    }
}
