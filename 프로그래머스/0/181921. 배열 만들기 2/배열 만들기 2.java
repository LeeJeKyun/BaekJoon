import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++) {
            String iToString = String.valueOf(i);
            char[] charArray = iToString.toCharArray();
            boolean factor = true;
            for(char c:charArray) {
                if(c!='5' && c!='0'){
                    factor = false;
                    break;
                } else {
                    factor &= true;
                }
            }
            if(factor) list.add(i);
        }
        int[] answer = null;
        if(list.size() != 0) {
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i]=list.get(i);
            }
        }
        return list.size() != 0 ? answer : new int[]{-1} ;
    }
}