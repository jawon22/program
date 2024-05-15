class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        
        String result1 = a1+b1;
        String result2 = b1+a1;
        
        int sum1 = Integer.parseInt(result1);
        int sum2 = Integer.parseInt(result2);
        if(sum1 >= sum2) answer = sum1;
        else answer= sum2;
        
        return answer;
    }
}