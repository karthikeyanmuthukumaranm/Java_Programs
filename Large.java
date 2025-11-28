import java.util.Scanner;

public class Large {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6};
        int largeelement=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largeelement){
                largeelement=arr[i];
            }
        }
        System.out.println(largeelement);
        sc.close();
    }
}
