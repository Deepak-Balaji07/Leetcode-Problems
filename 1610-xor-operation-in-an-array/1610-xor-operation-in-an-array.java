class Solution {
    public int xorOperation(int n, int start) {
        int [] arr = new int[n];
        arr[0]=start;
        for(int i=1;i<n;i++){
            arr[i]= start+ 2*i;
        }
        int res=arr[0];
        for(int j =1;j<n;j++){
            res^=arr[j];
        }
        return res;
    }
}