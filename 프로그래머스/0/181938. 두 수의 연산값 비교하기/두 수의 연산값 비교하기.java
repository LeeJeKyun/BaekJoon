class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int ab = Integer.parseInt(sb.append(a).append(b).toString());
        int times = 2 * a * b;
        return ab >= times ? ab : times;
    }
}