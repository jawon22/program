import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        int groupSize = 5;
        int numberOfGroups = (names.length + groupSize - 1) / groupSize; 
        String[] answer = new String[numberOfGroups];
        
        for (int i = 0; i < numberOfGroups; i++) {
            answer[i] = names[i * groupSize];
        }
        
        return answer;
    }
}
