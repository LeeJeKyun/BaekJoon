import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; ; i++){
            answer += n%10;
            n = n/10;
            if(n==0){
                break;
            }
        }
        System.out.println(answer);

        return answer;
    }
}