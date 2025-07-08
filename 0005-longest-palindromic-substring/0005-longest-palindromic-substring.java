class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length()==0) return "";
        String longest = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr = s.substring(i,j+1);
                if(isPalindrome(substr) && substr.length() > longest.length()){
                    longest = substr;
                }
            }
        }
        return longest;
    }
    public boolean isPalindrome(String substr){
        int left = 0, right = substr.length()-1;
        while(left < right){
            if(substr.charAt(left++) != substr.charAt(right--)) return false;
        }
        return true;
    }
}