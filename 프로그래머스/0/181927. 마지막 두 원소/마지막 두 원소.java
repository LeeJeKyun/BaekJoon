class Solution {
    public int[] solution(int[] num_list) {
        int numLength = num_list.length;
        int answerLength = numLength + 1;
        int numLastIndex = numLength - 1;
        int[] answer = new int[answerLength];
        for(int i=0; i<numLength; i++) {
            if(i==numLastIndex) {
                if(num_list[numLastIndex]>num_list[numLastIndex-1])
                    answer[i+1]=num_list[numLastIndex] - num_list[numLastIndex-1];
                else 
                    answer[i+1]=2*num_list[numLastIndex];
            }
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}