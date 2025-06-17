class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder res = new StringBuilder(s).reverse();
        return s.equals(res.toString());
    }
}