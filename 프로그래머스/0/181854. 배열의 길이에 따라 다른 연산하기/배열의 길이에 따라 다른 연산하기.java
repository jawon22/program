class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        
            for(int i= length%2==1?0:1 ; i<length; i+=2){
                arr[i] += n;        
            }    
        
        return arr;
    }
}