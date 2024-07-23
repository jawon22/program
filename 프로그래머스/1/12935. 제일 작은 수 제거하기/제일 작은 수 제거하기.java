import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int[] answer;
        
        if(size ==1){
            answer = new int[]{-1};    
        }
        else{
            List<Integer> list = new ArrayList<>();
            for(int n :arr){
                list.add(n);
            }
            
            int minValue = Collections.min(list);
            list.remove(Integer.valueOf(minValue));
            
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
       
        return answer;
    }
}