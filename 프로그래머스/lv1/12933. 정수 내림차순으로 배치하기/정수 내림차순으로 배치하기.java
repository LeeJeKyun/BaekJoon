import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        
        str += n;
        
        long[] lArr = new long[str.length()];
        for(int i=0; i<str.length(); i++){
            lArr[i] = n%10;
            n /= 10;
        }

        Arrays.sort(lArr);
        String strA = "";
        
        for(int i=0; i<str.length(); i++){
            strA += lArr[str.length()-i-1];
        }
        answer = Long.parseLong(strA);
        
        
        return answer;
    }
}