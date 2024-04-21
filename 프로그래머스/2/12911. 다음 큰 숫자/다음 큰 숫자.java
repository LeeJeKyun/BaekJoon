class Solution {
    public int solution(int n) {
        int answer = n + 1;
        String nBinary = Integer.toBinaryString(n);
        char[] nArray = nBinary.toCharArray();
        int nCount = 0;
        for(char c: nArray) {
            if(c=='1') nCount++;
        }
        while(true) {
            String answerBinary = Integer.toBinaryString(answer);
            char[] answerArray = answerBinary.toCharArray();
            int answerCount = 0;
            for(char c: answerArray) {
                if(c=='1') answerCount++;
            }
            if(answerCount == nCount){
                return answer;
            }
            answer++;
        }
    }
}