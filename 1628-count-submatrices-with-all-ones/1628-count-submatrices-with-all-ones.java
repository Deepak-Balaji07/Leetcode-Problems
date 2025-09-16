class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int [][] height = new int[m][n];
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    height[i][j] = (i==0)?1:height[i-1][j]+1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int min = height[i][j];
                for(int k=j;k>=0 && min >0;k--){
                    min = Math.min(min,height[i][k]);
                    count+= min;
                }
            }
        }
        return count;
    }
}