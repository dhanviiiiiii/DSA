class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0,right=0,maxFreq=0,maxLen=0;;
        while(right<s.length()){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq, freq[ch-'A']);

            if((right-left+1)-maxFreq>k){//length of the window-maxfreq 
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen, (right-left+1));
            right++;
        }
        return maxLen;
    }
}