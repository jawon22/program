import java.util.*;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        
        Arrays.sort(c);
        for(int i=0, j= c.length-1; i<j ; i++,j--){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        
        return new String(c);
    }
}