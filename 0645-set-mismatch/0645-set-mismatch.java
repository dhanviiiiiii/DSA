class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        int dup=-1;
        for(int num:nums){
            if(set.contains(num)){
                dup=num;
            }
            set.add(num);
        }

        int missing=-1;
        for(int num=1;num<=nums.length;num++){
            if(!set.contains(num)){
                missing=num;
                break;
            }
        }
        return new int[]{dup,missing};
    }
}