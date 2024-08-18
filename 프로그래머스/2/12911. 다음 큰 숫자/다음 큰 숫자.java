class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=0;
        
        a = count(n);
        
        while(true){
            int result=0;
            n++;
            result = count(n);
            
            if(a==result) {
                answer = n;
                break;
            }
        }
      
        return answer;
    }
    
    private int count(int num){
        int count=0;
        
        while(num>0){
            if(num%2==1)count++;
            num/=2;
        }
        return count;
    }
}