class AdajacentToDiagonalZero{
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,4},
            {2,3,5},
            {3,5,6}
        };
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(i-j)==1){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}