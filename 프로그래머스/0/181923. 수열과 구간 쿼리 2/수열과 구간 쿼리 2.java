class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int i=0;
        for(int[] query: queries) {
            int tmp = 10000000;
            for(int j=query[0]; j<=query[1]; j++) {
                if(arr[j]>query[2] && arr[j]<tmp){
                    tmp=arr[j];
                }
            }
            if(tmp==10000000) tmp=-1;
            answer[i]=tmp;
            i++;
        }
        return answer;
    }
}