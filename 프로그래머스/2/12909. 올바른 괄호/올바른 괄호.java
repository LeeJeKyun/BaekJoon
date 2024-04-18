class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int factor = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        char[] charArr = s.toCharArray();
        if(charArr[0]==')') return false;
        else {
            for(char c:charArr){
                if(factor < 0) return false;
                if(c=='(') {
                    factor++;
                } else if(c==')') {
                    factor--;
                }
            }
        }

        return factor == 0 ? true : false;
    }
}