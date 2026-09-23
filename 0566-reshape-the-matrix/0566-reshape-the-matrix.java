class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int col=mat[0].length;

        if(rows*col != r*c)     return mat;

        int[][] result= new int[r][c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=mat[k/col][k%col];
                k++;
            }
        }
        return result;       
    }
}