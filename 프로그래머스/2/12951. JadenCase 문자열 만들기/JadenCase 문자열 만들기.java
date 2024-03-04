import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.ArrayList;
class Solution {
    public String solution(String str) {
        String answer = "";

        String lowerCase = str.toLowerCase();
        String[] split = lowerCase.split("");
        boolean flag = true;

        for (String ss : split) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
    
}