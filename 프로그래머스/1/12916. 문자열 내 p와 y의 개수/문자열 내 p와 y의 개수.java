class Solution {
    boolean solution(String s) {
        int count = 0;
        int count1 = 0;
        
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                count ++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                count1 ++;
            }
        }
        boolean answer = count == count1 ? true : false;

        return answer;
    }
}