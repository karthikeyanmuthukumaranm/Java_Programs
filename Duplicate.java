import java.util.*;
public class Duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,4,5,1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
        sc.close();
    }
}
