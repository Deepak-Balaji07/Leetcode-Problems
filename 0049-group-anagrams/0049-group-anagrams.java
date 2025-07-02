class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hs = new HashMap<>();
        for(String st : strs){
            char [] arr = st.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            hs.computeIfAbsent(key,k-> new ArrayList<>()).add(st);
        }
        return new ArrayList<>(hs.values());
    }
}