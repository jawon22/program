class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            char c= my_string.charAt(i);
            
            if(!Character.isLetter(c)){ // c가 알파벳이 아니면
                answer+= Character.getNumericValue(c); //c가 숫자인경우 값그대로 반환 아니면-1
            }
        }
        
        return answer;
    }
}