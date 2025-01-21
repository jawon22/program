import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0; // 단어 짝수 홀수 구별변수
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                answer.append(c);
                index = 0; // 인덱스 초기화
            } else{
                if(index %2 == 0){
                    answer.append(Character.toUpperCase(c));
                } else{
                    answer.append(Character.toLowerCase(c));
                }
                index++;
            }
        }
       return answer.toString();
    }
}