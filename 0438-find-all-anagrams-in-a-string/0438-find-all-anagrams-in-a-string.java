class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] countS=new int[26];
        int[] countP=new int[26];

        List<Integer> ans=new ArrayList<>();

        if(s.length()<p.length()) return ans;

        // Frequency of p and first window of s. We only want the first window, whose size is p.length().
        for(int i=0;i<p.length();i++){
            countS[s.charAt(i)-'a']++;
            countP[p.charAt(i)-'a']++;
        }

        //Check first window
        if(Arrays.equals(countP,countS)) ans.add(0);
        int left=0;
        for(int right=p.length();right<s.length();right++){
            countS[s.charAt(right)-'a']++;// Add new character
            countS[s.charAt(left)-'a']--;//remove old character. CountP represents the fixed pattern. We should never modify it.
            left++;
        
        if(Arrays.equals(countP,countS)){
            ans.add(left);
        }
        }
        return ans;
    }
}