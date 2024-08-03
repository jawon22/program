import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split(" ",-1);
        
        for(String word : str){
            if(word.length() >0){
                if(Character.isAlphabetic(word.charAt(0))){
                    answer.append(Character.toUpperCase(word.charAt(0)));
                    answer.append(word.substring(1).toLowerCase());
                }
                else{
                    answer.append(word.charAt(0));
                    answer.append(word.substring(1).toLowerCase());
                }
            }
            answer.append(" ");
        }
        if (answer.length() > 0) {
            answer.setLength(answer.length() - 1);
        }
        
        return answer.toString();
    }
}