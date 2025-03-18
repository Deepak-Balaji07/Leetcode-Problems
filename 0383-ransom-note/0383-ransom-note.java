class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] chararray = new int[26];
        for(char c:magazine.toCharArray()){
            chararray[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(chararray[c-'a']==0){
                return false;
            }
            chararray[c-'a']--;
        }
        return true;
    }
}