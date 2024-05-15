class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result = String.valueOf(a)+ String.valueOf(b);
        
        int max = Integer.parseInt(result) >= 2*a*b ? Integer.parseInt(result) : 2*a*b;
        
        return max;
    }
}