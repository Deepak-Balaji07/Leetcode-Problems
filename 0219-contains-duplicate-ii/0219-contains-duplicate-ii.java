class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int store = 0;
        // int n = nums.length;
        // if( n==1 ){
        //     return false;
        // }
        // for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             store = Math.abs(i-j);
        //             break;
        //         }
        //     }
        //    if(store <= k){
        //        return true;
        //     }
        // }
        // return false;
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i]) && i - hs.get(nums[i]) <= k){
                return true;
            }
            hs.put(nums[i],i);
        }
        return false;
    }
}