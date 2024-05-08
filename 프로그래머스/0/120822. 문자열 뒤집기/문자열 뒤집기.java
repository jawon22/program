class Solution {
    public String solution(String my_string) {
        int length = my_string.length();
        char[] answer = new char[length];
        int a= 0;
        
        for(int i=length-1; i>=0; i--){
            answer[a] = my_string.charAt(i);
            a++;
        }
        return new String(answer);
    }
}