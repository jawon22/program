class Solution {
    public int solution(int n) {
        int answer = 0;
        // n % 1~n까지 해서 나머지가 0일때만 answer에 더하기
        for(int i=1; i<=n;i++){
            if(n%i ==0) answer += i;
        }
        return answer;
    }
}