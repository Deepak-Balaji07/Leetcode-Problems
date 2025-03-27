class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int esum =0,dsum =0;
        for(int i=0;i<n;i++){
            esum+=nums[i];
        }
        for (int i = 0; i < n; i++) {
            int num = nums[i]; 
            while (num > 0) {
                int rem = num % 10;
                dsum += rem;
                num /= 10;
            }
        }

        return Math.abs(esum - dsum); 
    }
}