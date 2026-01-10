public class Transpose {
    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = matrix.length;

        // in-place transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // print matrix
        System.out.println("Transpose:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
