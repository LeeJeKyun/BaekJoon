class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            for(int n = b; n<a+1; n++){
                answer += n;
            } 
        } else if(a==b){
                answer = a;
        } else {
            for(int n = a; n<b+1; n++){
                   answer += n;
            }
        }    
        return answer;
    }
}