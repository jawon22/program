class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i =0; i<myString.length(); i++){
            char c = myString.charAt(i);
            if('a'<= c && c <='z'){
                answer += Character.toUpperCase(c);    
            }
            else answer += c;
        }
        
        return answer;
    }
}