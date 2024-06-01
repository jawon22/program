class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int count=0;
                
        for(int i=0; i< s.length(); i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') 
              || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                count++;
            }
        }
        boolean isNumber = count== 0 ? true : false;
        boolean isSize = s.length()==4 || s.length() ==6;
        answer = isNumber && isSize;
        
        return answer;
    }
}