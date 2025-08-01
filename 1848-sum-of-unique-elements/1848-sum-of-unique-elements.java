class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer , Integer> hs = new HashMap<>();
        int sum = 0;
        for(int num : nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }
}