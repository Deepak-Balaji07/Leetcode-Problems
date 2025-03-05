class Solution {
    public long coloredCells(int n) {
        long num =1;
        for(int i=1;i<n;i++){
            num+=(i*4);
        }
        return num;
    }
}