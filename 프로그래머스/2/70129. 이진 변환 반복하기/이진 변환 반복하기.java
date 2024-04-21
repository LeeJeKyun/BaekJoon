class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(true) {
            if(s.equals("1")) break;
            char[] firstStep = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : firstStep) {
                if(c=='1') sb.append(c);
                else answer[1]++;
            }
            String removedStr = sb.toString();
            int length = removedStr.length();
            s = Integer.toBinaryString(length);
            answer[0]++;
        }
        return answer;
    }
}