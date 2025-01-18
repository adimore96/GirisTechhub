/*
1. Matrix Multiplication using Constructors
Problem: Create a class Matrix with a constructor that takes two matrices as input (both matrices will have the same dimensions). Implement a matrix multiplication operation using a constructor, and return the result as a new matrix.
*/
class Matrix{
    private int matrix1[][], matrix2[][];
    private int result[][];
    Matrix(int[][] matrix1, int [][] matrix2){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if(col1 != row2){
            System.out.println("Invalid matrix...!");
            return;
        }

        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = getMultiply();
    }

    public int[][] getMultiply(){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;

        //Declare the result[][] matrix
        int result[][] = new int[row1][col2];
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for(int k=0; k<col1; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }


        return result;
    }

    //Display matrix
    public void displayMatrix(){
        System.out.println("Displaying Multiplied Matrix");
        for(int i=0; i<result.length; i++){
           for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

class MatrixApp{
    public static void main(String args[]){
        int m1[][] = {
            {1,2,3},
            {4,5,6}
        };
        int m2[][] = {
            {10,11},
            {20,21},
            {30,31}
        };
        Matrix m = new Matrix(m1,m2);
        m.displayMatrix();
    }
}