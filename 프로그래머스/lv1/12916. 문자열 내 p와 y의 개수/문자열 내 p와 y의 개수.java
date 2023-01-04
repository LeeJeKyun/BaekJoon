class Solution {
    boolean solution(String s) {
        int pNum = 0;
        int yNum = 0;
        boolean answer = true;
        char[] alpha = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            alpha[i] = s.charAt(i);
        }
        
        for(int i=0; i<alpha.length; i++){
            if(alpha[i]=='p' || alpha[i]=='P'){
                pNum++;
            } else if(alpha[i] == 'y' || alpha[i] == 'Y'){
                yNum++;
            }
                
        }
        if(pNum==yNum){
            answer = true;
        } else{
            answer = false;
        }
        

        return answer;
    }
}