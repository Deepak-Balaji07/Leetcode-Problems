class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean isneg = num < 0;
        num = Math.abs(num);
        StringBuilder st = new StringBuilder();
        while(num>0){
            st.append(num%7);
            num/=7;
        }
        if(isneg){
            st.append("-");
        }
        return st.reverse().toString();
    }
}