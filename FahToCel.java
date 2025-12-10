import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Fah value :");
        int f=sc.nextInt();
        int c=(f-32)*5/9;
        System.out.println("Celcius value is: "+c);
        sc.close();
    }
}
