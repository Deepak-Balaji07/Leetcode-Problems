class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // int n = arr.length;
        // List<Integer> ls = new ArrayList<>();
        // for(int i = 0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         ls.add(arr[i]/arr[j]);
        //     }
        // }
        // Collections.sort(ls);
        // int [] narr = new int[ls.size()];
        // for(int i=0;i<narr.length;i++){
        //     narr[i]=ls.get(i);
        // }
        // for(int i=0;i<narr.length;i++){
        //     if(i == k-1){
        //         for(int j=i;j<n;j++){
        //             if(arr[i]/arr[j] == narr[i]){
        //                 return new int[]{arr[i],arr[j]};
        //             }
        //         }
        //     }
        // }
        // return new int[]{};
        int n = arr.length;
        List<int[]> ls  = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ls.add(new int[]{arr[i],arr[j]});
            }
        }
        Collections.sort(ls,(a,b)->Integer.compare(a[0]*b[1],a[1]*b[0]));

        return ls.get(k-1);
    }
}