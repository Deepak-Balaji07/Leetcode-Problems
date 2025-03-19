class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int single =0;
        int doubled =0;
        int total =0;
        int alice =0;
        for(int i=0;i<n;i++){
            total+= nums[i];
            if(nums[i]<10){
                single+=nums[i];
            }
            else{
                doubled+=nums[i];
            }
        }
        if(single > total-single){
            return true;
        }
        if(doubled > total-doubled){
            return true;
        }
        return false;
    }
}