import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> clear = new HashSet<>();

        for(int num : nums) {
            clear.add(num);
        }
        int max = nums.length/2;

        if(clear.size() >= max) return max;
        else return clear.size();
    }
}