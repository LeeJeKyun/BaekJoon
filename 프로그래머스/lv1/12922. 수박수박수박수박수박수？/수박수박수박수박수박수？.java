class Solution {
    public String solution(int n) {
        String answer = "";
        if(n%2==0){
            while(true){
                if(n%2==0){
                    answer += "수";
                    n--;
                } else if(n%2==1){
                    answer += "박";
                    n--;
                }
                if(n==0){
                    break;
                }
            }
        } else if(n%2==1){
            while(true){
                if(n%2==1){
                    answer += "수";
                    n--;
                } else if(n%2==0){
                    answer += "박";
                    n--;
                }
                if(n==0){
                    break;
                }
            }
        }
        return answer;
    }
}