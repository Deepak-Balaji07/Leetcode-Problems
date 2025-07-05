class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int count = arr[i];
            int c1 = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==count){
                    c1++;
                }
            }
            if(c1 == count){
                max = Math.max(max,c1);
            }  
        }
        if(max == 0){
            return -1;
        }
        return max;
    }
}