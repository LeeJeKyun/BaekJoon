class Solution {
    public int solution(int angle) {
        return angle <= 90?(angle==90?2:1):(angle==180?4:3);
    }
}