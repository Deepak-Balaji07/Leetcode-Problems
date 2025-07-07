class Solution {
    public boolean rotateString(String s, String goal) {
        // if(s == goal){
        //     return false;
        // }
        // if(s.length() != goal.length()){
        //     return false;
        // }
        // char [] arr = s.toCharArray();
        // char [] arr1 = goal.toCharArray();
        // for(int i =0;i<s.length();i++){
        //     if(arr[i] == arr1[i]){
        //         return false;
        //     }
        // }
        // return true;
        if(s.length() != goal.length()){
            return false;
        }
        String ds = s+s;
        boolean res = ds.contains(goal);
        return res;

    }
}