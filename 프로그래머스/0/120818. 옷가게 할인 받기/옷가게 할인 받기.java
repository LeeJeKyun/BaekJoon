class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price < 300000) {
            double result = price * 0.95;
            answer = (int)result;
        } else if(price >= 300000 && price < 500000) {
            double result = price * 0.90;
            answer = (int)result;
        } else if(price >= 500000) {
            double result = price * 0.80;
            answer = (int)result;
        } else {
            answer = price;
        }
        return answer;
    }
}