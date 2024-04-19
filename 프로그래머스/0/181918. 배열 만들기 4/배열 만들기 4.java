import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stkList = new ArrayList<>();
        while(true) {
            if(i==arr.length) break;
            if(stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size()-1)<arr[i]) {
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size()-1) >= arr[i]){
                stkList.remove(stkList.size()-1);
            }
        }
        int[] stk = new int[stkList.size()];
        for(int j=0; j<stk.length; j++) {
            stk[j] = stkList.get(j);
        }
        
        return stk;
    }
}