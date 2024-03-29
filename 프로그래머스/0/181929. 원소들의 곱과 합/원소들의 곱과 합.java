class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int times = 1;
        for(int i:num_list){
            sum += i;
            times *= i;
        }
        return times>sum*sum?0:1;
    }
}