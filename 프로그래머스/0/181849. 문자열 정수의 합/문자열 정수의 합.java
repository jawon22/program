class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] strarr = new String[num_str.length()];
        char[] carr = num_str.toCharArray();
        
        for(int i =0; i<num_str.length(); i++){
            strarr[i] = String.valueOf(carr[i]);
            answer += Integer.parseInt(strarr[i]);
        }
        
        return answer;
    }
}