class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");// \s -> whitespace and + ->one or more 
        String result="";
        for(int i=words.length-1;i>=0;i--){
            result+=words[i];

            if(i!=0){//!=0 because no space is needed before first letter
                result+=" ";
            }
        }
        return result;
    }
}