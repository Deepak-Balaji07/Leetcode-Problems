class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count =0;
        Set<Character> st = new HashSet<>();
        for(Character s : brokenLetters.toCharArray()){
            st.add(s);
        }
        for(String words : text.split(" ")){
            boolean type = true;
            for(char word : words.toCharArray()){
                if(st.contains(word)){
                    type = false;
                    break;
                }
            }
            if(type){
                count++;
            }
        }
        return count;
    }
}