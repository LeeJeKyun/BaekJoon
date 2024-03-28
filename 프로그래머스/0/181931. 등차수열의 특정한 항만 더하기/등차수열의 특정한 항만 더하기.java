class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int currentA = a;

        for(boolean b : included) {
            if(b) answer += a;
            a = a + d;
        }

        return answer;
    }
}