import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer={-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        //가장 작은 수의 인덱스 찾기 minIndex
        int minIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[minIndex]>arr[i]){
                minIndex=i;
            } 
        }
        for(int i=0; i<arr.length; i++){
            if(i<minIndex){
                answer[i] = arr[i];
            } else if(i==minIndex){
                
            } else{
                answer[i-1]=arr[i];
            }
        }
        
        
        
        
        return answer;
    }
}