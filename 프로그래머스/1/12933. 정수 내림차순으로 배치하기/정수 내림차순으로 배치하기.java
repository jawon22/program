import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = Long.toString(n);
        char[] c = str.toCharArray();
        
        Arrays.sort(c); // 오름차순 정렬
        
        String result = new StringBuilder(new String(c)).reverse().toString();
        
        return Long.parseLong(result);
    }
}