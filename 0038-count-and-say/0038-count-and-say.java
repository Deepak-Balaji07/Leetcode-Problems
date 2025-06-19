class Solution {
    public String countAndSay(int n) {
        if(n<= 0 ){
            return "";
        }
        String res = "1";
        for(int i=1;i<n;i++){
            StringBuilder str = new StringBuilder();
            int count = 1;
            char [] arr = res.toCharArray();
            for(int j=1;j<arr.length;j++){
                if(arr[j]==arr[j-1]){
                    count++;
                }
                else{
                    str.append(count).append(arr[j-1]);
                    count =1;
                }
            }
            str.append(count).append(arr[arr.length-1]);
            res = str.toString();
        }
        return res;
    }
}