class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for(int i=0; i<code.length(); i++) {
            if(code.charAt(i)=='1'){
                mode++;
                continue;
            }
            if(mode%2==0 && i%2==0) {
                sb.append(code.charAt(i));
            } else if(mode%2==1 && i%2==1) {
                sb.append(code.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer.equals("") ? "EMPTY" : answer;
    }
}