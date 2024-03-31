class Solution {
    public int solution(int n) {
        int answer = 0;
        int gcd = 1;
        if(n > 6) {
            gcd = gcd(n, 6);
        } else if(n < 6) {
            gcd = gcd(6, n);
        } else {
            gcd = 6;
        }
        return n/gcd;
    }
    public int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
}