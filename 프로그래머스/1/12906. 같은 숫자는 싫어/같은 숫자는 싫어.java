import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int count=0;
        
        answer[0] = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] != answer[count]){
                count++;
                answer[count] = arr[i];
            }
        }
        
        int[] result = new int[count+1];
        System.arraycopy(answer,0,result,0,count+1);
        
        return result;
    }
}