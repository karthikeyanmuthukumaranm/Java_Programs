import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {14,5,32,4,5};

        for (int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int n:arr){
            System.out.println(n);
        }
        sc.close();
    }
}
