class Solution {
    public boolean doesAliceWin(String s) {
        s = s.toLowerCase();
        for(char ch : s.toCharArray()){
            if("aeiou".indexOf(ch) >=0){
                return true;
            }
        }
        return false;
    }
}