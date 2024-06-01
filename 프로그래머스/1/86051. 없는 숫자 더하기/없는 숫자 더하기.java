import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        // 0~9까지 모든 수가 있는 배열과 numbers에 있는 배열을 서로비교
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length ; i++){
            int count =0;
            for(int j=0; j<arr.length; j++){
                if(numbers[i]==arr[j]){
                    count++;
                }
                if(count == 1) {
                    answer-=arr[j];
                    break;
                }
            }
        }
        
        return answer;
    }
}