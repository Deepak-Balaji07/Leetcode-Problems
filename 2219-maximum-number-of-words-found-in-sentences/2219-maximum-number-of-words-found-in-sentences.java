class Solution {
    public int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int max =0;
        for(int i=0;i<len;i++){
            max = Math.max(max,sentences[i].split("\\s").length);
        }
        return max;
    }
}