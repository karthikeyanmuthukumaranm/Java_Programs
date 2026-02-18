package revise;

public class ArrSort {
    public static void main(String[] args){
        int[] arr = {2,3,1,4,5};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k :arr){
            System.out.print(k);
        }
    }
}
