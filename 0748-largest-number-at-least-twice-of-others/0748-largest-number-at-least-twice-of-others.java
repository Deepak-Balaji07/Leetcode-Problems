class Solution {
    public int dominantIndex(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int min = 0;
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    min = arr[i];
                }
            }
            if(min>max){
                max = min;
            }
        }
        int count =0;
        int res =0;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                res = i;
                continue;
            }
            if(arr[i]*2<= max){
                count++;
            }
            if(arr[i]*2>max){
                count =0;
                break;
            }
        }
        if(count > 0){
            return res;
        }
        return -1;
    }
}