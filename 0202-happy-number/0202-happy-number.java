class Solution {
    public boolean isHappy(int n) {
        //But there's one more problem: unhappy numbers can enter an endless cycle. For example, 2 eventually cycles through numbers instead of reaching 1.
        HashSet<Integer> set=new HashSet<>();

        while(n!=1){

            // If we've seen this number before,
            // we're in a cycle
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
         n=sum;
        }
        return true;
    }
}