import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] result = new int[num2];
        result = Arrays.copyOfRange(numbers,num1,num2+1);
        return result;
    }
}