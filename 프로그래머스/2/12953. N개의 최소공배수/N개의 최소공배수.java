class Solution {
    public int solution(int[] arr) {
        for(int i=0; i<arr.length-1 ; i++) {
            int lcm = lcm(arr[i], arr[i+1]);
            arr[i+1] = lcm;
        }
        return arr[arr.length-1];
    }
    
    private int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    private int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
}