class Solution {
    public int[] solution(int brown, int yellow) {
        
        int total = brown + yellow; // 전체 격자수
        
        for(int height = 3; height <= total/ height ; height++){ // 높이는 무조건 3이상이다.
            if(total % height ==0 ){
                int width = total / height;
                
                // 가운데 영역 검증
                if((width -2) * (height -2) == yellow){
                    return new int[]{width, height};
                }
            }
        }
        return new int[0];
    }
}