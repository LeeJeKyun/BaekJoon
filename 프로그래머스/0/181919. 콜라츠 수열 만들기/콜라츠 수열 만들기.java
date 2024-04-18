import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> intList = new ArrayList<>();
        while(true) {
            intList.add(n);
            if(n==1) break;
            if(n%2 == 0) {
                n = n/2;
            } else {
                n = 3*n+1;
            }
        }
        int[] answer = new int[intList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = intList.get(i);
        }
        
        return answer;
    }
}