class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        long reverse = 0;
        int j;
        
        for(int i=0; ; i++){
            int num = 1;
            for(j=0; j<i; j++){
                num *= 10;
            }
            reverse += n%10*num;
            n /= 10;
            if(n == 0){
                answer = new int[j+1];
                break;
            }
            
        }
        for(int i=0; ; i++){
            answer[i] = (short)(reverse%10);
            reverse /= 10;
            if(reverse==0){
                break;
            }
        }
        
        
        return answer;
    }
}