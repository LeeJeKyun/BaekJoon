class Solution {
    public int solution(int a, int b) {
        StringBuilder absb = new StringBuilder();
        StringBuilder basb = new StringBuilder();
        int ab = Integer.parseInt(absb.append(a).append(b).toString());
        int ba = Integer.parseInt(basb.append(b).append(a).toString());
        return ab >= ba ? ab : ba;
    }
}