class Solution {
    public boolean isnonzero(int val){
        while(val > 0){
            if(val%10 == 0){
                return false;
            }
            val/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
       for(int i=1;i<n;i++){
        int j = n-i;
        if(isnonzero(i) && isnonzero(j)){
            return new int[]{i,j};
        }
       }
        return new int[0];
    }
}