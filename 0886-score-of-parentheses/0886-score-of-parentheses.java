class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(0);
            }
            else{
                int inn = st.pop();
                int out = st.pop();
                int newsc = out+Math.max(2*inn,1);
                st.push(newsc);
            }
        }
        
        return st.pop();
    }
}