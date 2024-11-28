import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int startP = 1;
        int endP = 1;
        int sum = 1;
        int count = 1;
        while(endP<target) {
            if(sum < target){
                endP++;
                sum += endP;
            } else if(sum > target) {
                sum -= startP;
                startP++;
            } else if(sum == target) {
                endP++;
                sum += endP;
                count++;
            }
        }
        System.out.println(count);
    }
}