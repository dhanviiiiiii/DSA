class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        //put all words in a list
        List<String> list=new ArrayList<>(map.keySet());

        Collections.sort(list, (a,b)->{  //Sort list using the rules inside { }.
            if(map.get(a)!=map.get(b)){ // to check if freq of words are different
                return map.get(b)-map.get(a);// returns words in decending 
            }
            //if the freq of a and b are same
            return a.compareTo(b);
        });
        //subList(start, end) includes start but excludes end.
        return list.subList(0,k);
    }
}