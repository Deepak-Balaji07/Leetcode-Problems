class Solution {
    public boolean isHappy(int n) {
       Set<Integer> seen = new HashSet<>();
       while(n != 1 && !seen.contains(n)){
          seen.add(n);
          n = square(n);
       }
       return n == 1;
    }
    public int square(int num){
        int sum = 0;
        while(num != 0){
            int temp = num%10;
            sum += temp*temp;
            num /= 10;
        }
        return sum;
    }
}