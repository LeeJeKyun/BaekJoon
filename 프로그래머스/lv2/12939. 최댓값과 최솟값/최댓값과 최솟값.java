import java.util.Arrays;

class Solution {
    public String solution(String str) {
    
        String[] strArr = str.split(" ");
        int[] iArr = new int[strArr.length ];
        
        for(int i=0; i<strArr.length; i++) {
        	iArr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(iArr);
        
        return iArr[0] + " " + iArr[iArr.length-1];
        
    }
}