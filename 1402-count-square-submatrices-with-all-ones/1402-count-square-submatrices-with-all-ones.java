class Solution {
    public int countSquares(int[][] matrix) {
        int row = matrix.length , col = matrix[0].length;
        int count =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 1 && i>0 && j>0){
                    matrix[i][j] +=  Math.min(Math.min(matrix[i-1][j],matrix[i][j-1]),(matrix[i-1][j-1]));
                }
                count+=matrix[i][j];
            }
        }
        return count;
    }
}