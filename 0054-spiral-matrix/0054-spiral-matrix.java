class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int top =0,bottom = matrix.length-1;
        int left = 0,right = matrix[0].length-1;
        while(left <= right && top <=bottom){
            for(int i=left;i<=right;i++){
                ls.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                ls.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    ls.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int j=bottom;j>=top;j--){
                    ls.add(matrix[j][left]);
                }
                left++;
            }
        }
        return ls;
    }
}