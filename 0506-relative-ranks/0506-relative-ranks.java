class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String [] rank = new String[n];
        Integer [] index = new Integer[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }
        Arrays.sort(index , (a,b)-> score[b]-score[a]);

        for(int i=0;i<n;i++){
            if(i==0){
                rank[index[i]]="Gold Medal";
            }
            else if(i==1){
                rank[index[i]]="Silver Medal";
            }
            else if(i==2){
                rank[index[i]]="Bronze Medal";
            }
            else{
                rank[index[i]]=String.valueOf(i+1);
            }
        }
        return rank;
    }
}