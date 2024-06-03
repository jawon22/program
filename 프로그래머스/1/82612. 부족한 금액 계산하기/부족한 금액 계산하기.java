class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
        
        for(int i=1; i<=count; i++){
            answer += price*i;
        }
        
        if(answer-money >=0){
            result = answer-money;
        }

        return result;
    }
}