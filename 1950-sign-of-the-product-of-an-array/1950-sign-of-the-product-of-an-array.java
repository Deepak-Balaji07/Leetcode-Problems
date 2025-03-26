class Solution {
    public int arraySign(int[] nums) {
        int negnum = 0;
        for(int num:nums){
            if(num==0){
                return 0;
            }
            if(num<0){
                negnum++;
            }
        }
        int res = (negnum % 2 ==0)?1:-1;
        return res;
    }
}