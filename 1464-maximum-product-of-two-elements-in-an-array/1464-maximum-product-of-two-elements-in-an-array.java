class Solution {
    public int maxProduct(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int result=0;

        for(int i:nums){
            if(i>largest){
                second=largest;
                largest=i;
            }
            else if(i>second){
                second=i;
            }
        }
        result=(largest-1)*(second-1);
        return result;
    }
}