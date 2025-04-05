class Solution {
    public int countKeyChanges(String s) {
        String c = s.toLowerCase();
        int count =0;
        for(int i=0;i<s.length()-1;i++){
            if(c.charAt(i)!=c.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}