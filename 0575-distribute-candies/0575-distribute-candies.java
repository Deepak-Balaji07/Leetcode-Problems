class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int res = n/2;
        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        if(set.size() == 1){
            return 1;
        }
        int val = Math.min(res,set.size());
        return val;
    }
}