class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
            if(entry.getValue() == 2){
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}