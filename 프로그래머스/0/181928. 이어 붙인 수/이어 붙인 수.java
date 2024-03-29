class Solution {
    public int solution(int[] num_list) {
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();

        for(int i:num_list) {
            if(i%2==0) sbOdd.append(i);
            else sbEven.append(i);
        }

        return Integer.parseInt(sbOdd.toString()) + Integer.parseInt(sbEven.toString());
    }
}