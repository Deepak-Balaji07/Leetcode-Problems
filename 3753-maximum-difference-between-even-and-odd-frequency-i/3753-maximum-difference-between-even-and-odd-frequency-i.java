class Solution {
    public int maxDifference(String s) {
        int [] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        int mineven =Integer.MAX_VALUE;
        int maxodd = Integer.MIN_VALUE;

        for(int f:freq){
            if(f>0){
                if(f%2==0){
                    mineven = Math.min(mineven,f);
                }
                else{
                    maxodd = Math.max(maxodd,f);
                }
            }
        }
        return (mineven != Integer.MAX_VALUE && maxodd != Integer.MIN_VALUE)? maxodd-mineven:-1;
    }
}