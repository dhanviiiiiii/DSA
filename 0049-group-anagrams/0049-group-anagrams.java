class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String current=strs[i];
            char[] arr=current.toCharArray();
            Arrays.sort(arr);

            String key=new String(arr); //converts that char[] into a String
            // If this key already exists, add the string to its existing list.Otherwise, create a new list.
            map.putIfAbsent(key,new ArrayList<>());

            map.get(key).add(current);
        }
        return new ArrayList<>(map.values());
    }
}