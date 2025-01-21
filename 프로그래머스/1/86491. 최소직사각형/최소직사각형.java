class Solution {
    public int solution(int[][] sizes) {
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes){
            // 가로가 항상 긴것으로 배치
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            // 최대 가로와 최대 세로를 매번 업데이트
            maxWidth = Math.max(maxWidth,w);
            maxHeight = Math.max(maxHeight,h);
        }
        return maxWidth * maxHeight;
    }
}