import java.util.*;
import java.util.Map.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for(int i:array) {
            int key = i;
            if(numberMap.containsKey(key)){
                numberMap.put(key, numberMap.get(key)+1);
            } else {
                numberMap.put(key, 1);
            }
        }

        //array:갯수 형태로 Map에 넣어둔 상태

        int maxKey = 0;
        int answerValue = 0;
        Set<Map.Entry<Integer, Integer>> entry = numberMap.entrySet();
        for(Map.Entry<Integer, Integer> e: entry) {
            Integer value = e.getValue();
            Integer key = e.getKey();
            if(value == answerValue) {
                maxKey = -1;
            }
            if(value > answerValue) {
                maxKey = key;
                answerValue = value;
            }
        }
        return maxKey;
    }
}