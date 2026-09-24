class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int left=0;
        int right=r*c-1;

        while(left<=right){
            int position=left+(right-left)/2;

            int row=position/c;
            int col=position%c;

            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<target){
                left=position+1;
            }
            else{
                right=position-1;
            }
        }
        return false;
    }
}