class Solution {
    public int solution(int n, int k) {
        int answer = 12000*n + 2000*k;
        int count = n/10;
        if(count >0) { answer -= 2000*count; }
        return answer;
    }
}