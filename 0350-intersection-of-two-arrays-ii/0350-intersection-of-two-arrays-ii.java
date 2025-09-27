class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int n:nums1){
            hs.put(n,hs.getOrDefault(n,0)+1);
        }
        for(int n1 : nums2){
            if(hs.containsKey(n1) && hs.get(n1) > 0){
                ls.add(n1);
                hs.put(n1,hs.get(n1)-1);
            }
        }
        int [] arr = new int[ls.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
 }