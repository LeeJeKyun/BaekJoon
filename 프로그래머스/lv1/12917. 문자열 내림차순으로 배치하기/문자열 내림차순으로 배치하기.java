class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            char tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
        
        String answer = sb.append(arr).reverse().toString();
        return answer;
    }
}