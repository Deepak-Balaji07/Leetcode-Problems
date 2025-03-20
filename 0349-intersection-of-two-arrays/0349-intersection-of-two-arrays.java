class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> hs1 = new HashSet<>();
       HashSet<Integer> hs2 = new HashSet<>();
       for(int val:nums1){
          hs1.add(val);
       }
       for(int val2:nums2){
         hs2.add(val2);
       }
       hs1.retainAll(hs2);
       int[] array = hs1.stream().mapToInt(Integer::intValue).toArray();
       return array;
    }
}