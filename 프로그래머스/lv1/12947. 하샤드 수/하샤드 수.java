class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int div = 0;
        int y = x;
        
        for(int i=0; ; i++){
            int a = y%10;   //예를들어 x=1234를 대입, a=4 a=3 a=2 a=1
            div += a;       //div = +4 +3 +2 +1
            y /= 10;        //x=123 12 1 0
            if(y==0){
                break;
            }
        }
        if(x%div==0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        
        return answer;
    }
}