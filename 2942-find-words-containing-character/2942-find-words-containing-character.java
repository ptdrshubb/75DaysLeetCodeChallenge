class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String s = String.valueOf(x);
        ArrayList<Integer> str = new ArrayList<>();
        int idx =0;
        for(String w : words){
            if(w.contains(s)){
                str.add(idx);
                
            }
            idx++;
        }
        return str;
    }
}