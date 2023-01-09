class Solution {
    public int solution(int num) {
        int answer = 0;
        
        for(answer=0; answer<500; answer++){
            if(num%2 == 0){
                num /= 2;
            } else if(num == 1){
                break;
            } else if(num%2 == 1){
                num = num*3+1;
            }
        }
        if(answer == 500){
            answer=-1;
        }
        
        return answer;
    }
}