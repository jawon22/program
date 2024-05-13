class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String a1 = my_string.substring(0,s);
        String a2 = my_string.substring(s+overwrite_string.length());
        
        String answer = a1+overwrite_string+a2;
        return answer;
    }
}