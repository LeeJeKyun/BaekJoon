import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int size = brown + yellow;
        List<Integer> candidates = new ArrayList<>();

        for(int i=1; i<=size; i++) {
            if(size%i == 0) candidates.add(i);
        }

        int answer1 = 1;
        for(Integer i : candidates) {
            if((i-2)*((size/i)-2)==yellow) {
                answer1 = i;
            }
        }
        return new int[]{answer1, size/answer1};
    }
}