import java.util.Scanner;
import java.util.Arrays;

class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxNum = 0;
        int[] scoreArr = new int[num];
        for(int i=0; i<num; i++) {
            scoreArr[i] = sc.nextInt();
            if(scoreArr[i] > maxNum) {
                maxNum = scoreArr[i];
            }
        }

        double sum = 0;
        for(int i=0; i<num; i++) {
            sum += (scoreArr[i]/(double)maxNum)*100;
        }
        System.out.println(sum/num);
    }
}