public class DiagonalZero {
    public static void main(String[] args){
        int matrix[][] = {
            {1,2,4},
            {5,6,8},
            {7,8,9}
        };
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            if (i==j){
                matrix[i][j]=0;
            }
        }
    }
    System.out.println("Matrix are :");
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            System.out.println(matrix[i][j] + " ");
        }
    }
    System.out.println();
    
    }
}
