import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        int turn=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0){
                answer.add(arr[i]);
                turn++;
            }
        }
        
        Collections.sort(answer);
        
        if(turn==0){
            answer.add(-1);
        }
        return answer;
    }
}