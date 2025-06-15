class Solution {
    public int maxDiff(int num) {
        String val = String.valueOf(num);
        char maxreplace = ' ';
        for(char c : val.toCharArray()){
            if(c != '9'){
                maxreplace = c;
                break;
            }
        }
        String maxnum = val.replace(maxreplace,'9');
        char minreplace =' ';
        char minnew = (val.charAt(0)=='1')?'0':'1';
        for(char c:val.toCharArray()){
            if(c != '0' && c!='1'){
                minreplace = c;
                break;
            }
        }
        String MinNew = val.replace(minreplace,minnew);
        return Integer.parseInt(maxnum)-Integer.parseInt(MinNew);
    }
}
