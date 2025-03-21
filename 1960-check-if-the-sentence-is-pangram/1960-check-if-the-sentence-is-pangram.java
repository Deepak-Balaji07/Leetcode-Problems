class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] ch = new int[26];
        // for(int i=0;i<ch.length;i++){
        //     ch[i]=0;
        // }
        for(int i=0;i<sentence.length();i++){
            char s = sentence.charAt(i);
            ch[s-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]==0){
                return false;
            }
        }
        return true;
    }
}