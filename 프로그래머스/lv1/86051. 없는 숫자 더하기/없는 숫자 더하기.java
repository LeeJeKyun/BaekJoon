import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] natureNum = {0,1,2,3,4,5,6,7,8,9};
        int[] natureNum2 = {0,1,2,3,4,5,6,7,8,9};

        for(int i=0; i<natureNum.length; i++){  //natureNum이 0부터 9까지 증가
            for(int j=0; j<numbers.length; j++){    //nubmers를 첫숫자부터 비교
                if(numbers[j]==natureNum[i]){   //만약 같은 숫자가 나오면 break;
                    natureNum2[i]=0;
                    break;
                }
            }
            
        }
        
        for(int i=0; i<natureNum2.length; i++){
            answer += natureNum2[i];
        }
        return answer;
    }
}