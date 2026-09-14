class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left=0;
        int count=0;
        int product=1;

        for(int right=0;right<nums.length;right++){
            product*=nums[right];
            
            //When the product becomes >= k, removing one element from the left may not be enough to make the product < k.
            while(product>=k){
                //removing the left element in the product subarray
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}