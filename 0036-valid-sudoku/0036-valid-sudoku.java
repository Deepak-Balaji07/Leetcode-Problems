class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> res = new HashSet<>();
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char curr = board[i][j];
            if(curr!= '.'){
                String rowcheck = "row"+i+curr;
                String colcheck = "col"+j+curr;
                String box = "box"+(i/3)+(j/3)+curr;
                if(!res.add(rowcheck)||!res.add(colcheck)||!res.add(box)){
                return false;
            }
            }
        }
       }
       return true;
    }
}