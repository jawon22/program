import java.util.*;

class Solution {
    public String solution(String s) {
        String[] sarr = s.split(" ");
        int[] arr = new int[sarr.length];
        
        for(int i =0 ; i<sarr.length ; i++){
            arr[i] = Integer.parseInt(sarr[i]);
        }
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[arr.length - 1];
        
        return min + " " + max;
    }
}