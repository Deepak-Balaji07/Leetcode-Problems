class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long streak = 0 , count =0;
        for(int num:nums){
            if(num == 0){
                streak++;
                count += streak;
            }
            else{
                streak = 0;
            }
        }
        return count;
    }
}