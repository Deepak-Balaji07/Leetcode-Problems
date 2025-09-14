class Solution {
    public int maxFreqSum(String s) {
        int vfre = 0,cfre =0;
        int n = s.length();
        s = s.toLowerCase();
       HashMap<Character,Integer> hs = new HashMap<>();
       for(char ch : s.toCharArray()){
        hs.put(ch,hs.getOrDefault(ch,0)+1);
       }
       int sum = 0;
       int vc = 0,cc=0;
       for(Map.Entry<Character,Integer> entry : hs.entrySet()){
        if(entry.getKey()=='a'|| entry.getKey()=='e'|| entry.getKey()=='i'|| entry.getKey()=='o'|| entry.getKey()=='u'){
            vc = entry.getValue();
            vfre = Math.max(vfre,vc);
        }
        else{
            cc = entry.getValue();

        }
        cfre = Math.max(cfre,cc);
       }

       return vfre+cfre;
    }
}