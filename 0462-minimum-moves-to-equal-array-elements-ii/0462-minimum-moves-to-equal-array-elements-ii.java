class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        long tot = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long min =0;
            for(int j=0;j<n;j++){
                min += Math.abs(nums[i]-nums[j]);
            }
            tot = Math.min(min,tot);
        }
        return (int)tot;
    }
}