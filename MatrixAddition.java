package myexercise3;

public class MatrixAddition {
    public int[][] sum(int rows, int columns, int[][] matrix1, int[][] matrix2)
    {
        int matrix3[][]=new int[rows][columns];
       for(int i=0;i<rows;i++)
       {
           for(int j=0;j<columns;j++)
           {
               matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
           }
       }

        return matrix3;
    }
}
