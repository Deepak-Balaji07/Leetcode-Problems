class Solution {
    public char kthCharacter(int k) {
        ArrayList<Character> ls = new ArrayList<>();
        ls.add('a');
        while(ls.size()<k){
            int s = ls.size();
            for(int i=0;i<s;i++){
                char ch = (char)((ls.get(i)-'a'+1)%26 +'a');
                ls.add(ch);
            }
        }
        return ls.get(k-1);
    }
}