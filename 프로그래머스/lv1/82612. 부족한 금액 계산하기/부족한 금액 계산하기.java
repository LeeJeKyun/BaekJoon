class Solution {
    public long solution(int price, int money, int count) {
        long totalCnt = 0;
        for(int i=1; i<=count; i++){
            totalCnt += i;
        }
        
        long totalPrice = price*totalCnt;
        long result = totalPrice-money;
        long answer = 0;
        if(result <= 0){
            answer = 0;
        } else {
            answer = result;
        }

        return answer;
    }
}