class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = num_list.length;
        for(int i=0; i<b; i++){
            if(num_list[i] % 2 == 0) a++;
        }
                
        int[] answer = {a,b-a};
        return answer;
    }
}