class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] array: queries) {
            int tmp = arr[array[0]];
            arr[array[0]] = arr[array[1]];
            arr[array[1]] = tmp;
        }
        return arr;
    }
}