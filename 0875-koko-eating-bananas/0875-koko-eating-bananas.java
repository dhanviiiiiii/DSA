class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }

        while(left<=right){
            //calc the mid speed of koko
            int mid=left+(right-left)/2;

            long hours=0;
            //calculating the hours req by koko to eat pile in mid speed
            for(int pile:piles){
                hours+=(pile+mid-1)/mid;
            }
            //"Can Koko finish all the bananas within h hours at speed mid?"
            if(hours<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}