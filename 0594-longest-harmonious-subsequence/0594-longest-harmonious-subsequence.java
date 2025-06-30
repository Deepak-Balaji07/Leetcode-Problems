class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0,r = 1;
        int n = nums.length;
        int res = 0;
        while(r<n){
            int diff = nums[r]-nums[l];
            if(diff == 1){
                res = Math.max(res,r-l+1);
            }
            if(diff <= 1){
                r++;
            }
            else{
                l++;
            }
        }
        return res;
    }
}