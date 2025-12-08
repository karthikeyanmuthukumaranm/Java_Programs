public class MoveZerosToLast {
    public static void main(String[] args){
        int[] arr={0,2,4,6,0,1};
        int[] result = new int[arr.length];
        int start =0;
        int end = arr.length-1;

        for(int n : arr){
            if(n==0){
                result[end]=0;
                end--;
            }else{
                result[start]=n;
                start++;
            }
        }
        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
