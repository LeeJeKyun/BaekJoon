import java.util.ArrayList;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = 0;
        int denom = 0;

        int maxCommonDiv = maxCommonDiv(denom1, denom2);
        denom = denom1*denom2/maxCommonDiv;
        numer = denom/denom1*numer1 + denom/denom2*numer2;

        int lastMax = maxCommonDiv(numer, denom);
        denom /= lastMax;
        numer /= lastMax;

        int[] answer = {numer, denom};
        return answer;
    }
    
    public int maxCommonDiv(int num1, int num2) {
        //최대공약수 찾기
        //공약수 List
        ArrayList<Integer> commonDivs = new ArrayList<>();
        int maxCommonDiv = 1;
        for(int i=1; i<=num1; i++) {
            if(num1%i==0) commonDivs.add(i);
        }
        for(Integer i : commonDivs) {
            if(num2%i==0) maxCommonDiv = i;
        }
        return maxCommonDiv;
    }
}