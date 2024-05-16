class Solution {
    public String solution(String my_string) {
        String answer = "";
               
        for(int i= 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isUpperCase(c)) { // 대문자인 경우 소문자로 변환
                answer += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) { // 소문자인 경우 대문자로 변환
                answer += Character.toUpperCase(c);
            } else { // 알파벳이 아닌 경우 그대로 유지
                answer += c;
            }
        }
        
        return answer;
    }
}