class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] phoneN = phone_number.toCharArray();
        for(int i=0; i<phoneN.length-4; i++){
            phoneN[i] = '*';
        }
        for(int i=0; i<phoneN.length; i++){
            answer += phoneN[i];
        }
        return answer;
    }
}