import java.util.*;

public class Solution {
public int[] solution(int[] arr) {
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> resultList = new ArrayList<>();

        for(int a : arr) {
            queue.add(a);
        }

        Integer prev = -1;
        while(!queue.isEmpty()) {
            Integer now = queue.pop();
            if(prev == now) {
                prev = now;
                continue;
            } else {
                resultList.add(now);
                prev = now;
            }
        }

        int[] result = new int[resultList.size()];
        for(int i = 0; i<result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;

    }
}