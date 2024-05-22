import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = String.valueOf(n);
        char[] arrCh = s.toCharArray();
        
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(String.valueOf(arrCh[i]));
        }

        return answer;
    }
}