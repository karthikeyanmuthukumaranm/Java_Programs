public class BinarySearch {

    static int Binary(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == tar) {
                return mid;
            } 
            else if (arr[mid] > tar) {
                high = mid - 1;   // correct
            } 
            else {
                low = mid + 1;
            }
        }
        return -1;  // correct position
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int tar = 6;

        int result = Binary(arr, tar);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } 
        else {
            System.out.println("Element not found");
        }
    }
}
