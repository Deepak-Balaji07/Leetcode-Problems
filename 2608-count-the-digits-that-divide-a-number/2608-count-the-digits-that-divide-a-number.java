class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count =0;
        while(temp>0){
            int rem = temp%10;
            temp = temp/10;
            if(num % rem == 0){
                count++;
            }
        }
        return count;
    }
}