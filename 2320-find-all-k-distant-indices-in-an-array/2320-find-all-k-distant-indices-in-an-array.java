class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int low =0;
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j]!=key) continue;
            int min = Math.max(low,j-k);
            int max = Math.min(n-1,j+k);
            while(min<=max){
                ls.add(min++);
            }
            low = max+1;
        }
        return ls;
    }
}