import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int length = p.length();
        Long pValue = Long.parseLong(p);
        
        for(int i=0; i<= t.length()-length; i++){
            String str = t.substring(i, i+length);
            Long result = Long.parseLong(str);
            
            if(result <=pValue) {
                count++;
              }
        }        
        
        return count;
    }
}