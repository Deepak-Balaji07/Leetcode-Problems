class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int n : nums){
            hs.put(n,hs.getOrDefault(n,0)+1);
        }
        int count =0;
        for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
            if(entry.getValue() == 1){
                count++;
            }
        }
        int [] arr = new int[count];
        int k = 0;
        for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
            if(entry.getValue() == 1){
                arr[k++] = entry.getKey();
            }
        }
        return arr;
    }
}