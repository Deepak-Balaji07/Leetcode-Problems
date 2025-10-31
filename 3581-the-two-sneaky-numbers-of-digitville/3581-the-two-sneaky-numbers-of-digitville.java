class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> unq = new HashMap<>();
        for(int num : nums){
            unq.put(num,unq.getOrDefault(num,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : unq.entrySet()){
            if(entry.getValue()>1){
                count++;
            }
        }
        int [] arr = new int[count];
        int k = 0;
        for(Map.Entry<Integer,Integer> entry : unq.entrySet()){
            if(entry.getValue()>1){
                arr[k++]= entry.getKey();
            }
        }
        return arr;
    }
}