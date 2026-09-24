class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int i=0, j=n-1;//top right corner
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]<target){
                i++;//need a larger value move down
            }
            else{
                j--;// need a smaller value move left
            }
        }
        return false;
    }
}