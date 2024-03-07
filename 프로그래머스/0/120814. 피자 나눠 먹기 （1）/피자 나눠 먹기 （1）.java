class Solution {
    public int solution(int n) {
        int remain =0;
        if(n%7 >0) remain=1;
        int result = n/7 + remain;
        return result;
    }
}