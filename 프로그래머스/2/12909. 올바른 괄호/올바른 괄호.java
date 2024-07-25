class Solution {
    boolean solution(String s) {
        int count =0;
        
        for(char c : s.toCharArray()){
            if(c =='('){
                count++;
            }
            else if(c ==')'){
                count--;
            }
            
            if( count <0) return false; // 처음에 ')'가 나오는 상황 방지
        }
        
        return count ==0;
    }
}