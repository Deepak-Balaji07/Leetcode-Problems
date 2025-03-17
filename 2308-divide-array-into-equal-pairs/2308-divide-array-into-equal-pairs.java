class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int len = n/2;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
                count =0;
                break;
            }
            i++;
        }
        if(count == 0){
            return false;
        }
        return true;
    }
}