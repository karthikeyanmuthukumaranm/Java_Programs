public class MissingNumber{
    public static void main (String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int totalexpected = n*(n+1)/2;
        int totalactual = 0;
        
        for(int i=0;i<arr.length;i++){
            totalactual+=arr[i];
        }
        int missingnum = totalexpected-totalactual;
        System.out.println(missingnum);
    }
}
