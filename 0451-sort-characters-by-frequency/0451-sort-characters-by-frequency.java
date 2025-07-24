class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c: s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        List<Character>[]buc = new List[s.length()+1];
        for(char c : hs.keySet()){
            int fre = hs.get(c);
            if(buc[fre] == null) buc[fre] = new ArrayList<>();
            buc[fre].add(c);
        }
        StringBuilder st = new StringBuilder();
        for(int i = buc.length-1;i>=0;i--){
            if(buc[i]!= null){
                for(char c : buc[i]){
                    st.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return st.toString();
    }
}