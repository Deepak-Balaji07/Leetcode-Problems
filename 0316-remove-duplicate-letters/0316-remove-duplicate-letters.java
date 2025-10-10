class Solution {
    public String removeDuplicateLetters(String s) {
        int [] freq = new int[26];
        boolean [] visited = new boolean[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            freq[ch-'a']--;
            if(visited[ch-'a']) continue;
            while(!st.isEmpty() && ch<st.peek() && freq[st.peek()-'a']>0){
                visited[st.pop()-'a'] = false;
            }
            st.push(ch);
            visited[ch-'a'] = true;
        }
        StringBuilder str = new StringBuilder();
        for(char c : st){
            str.append(c);
        }
        return str.toString();
    }
}