class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int res =0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && hs.get(s.charAt(i))<hs.get(s.charAt(i+1))){
                res+= hs.get(s.charAt(i+1))-hs.get(s.charAt(i));
                i++;
            }
            else{
                res+=hs.get(s.charAt(i));
            }
        }
        return res;
    }
}