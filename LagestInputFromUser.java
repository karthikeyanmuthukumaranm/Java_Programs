import java.util.Scanner;

public class LagestInputFromUser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter"+size+"Elements : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largeelement=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>largeelement){
                largeelement=arr[j];
            }
        }
        System.out.println("Lagrge Element is "+largeelement);
        sc.close();
    }
}
