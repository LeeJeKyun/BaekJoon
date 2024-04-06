import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=1; j<=i; j++) {
                sb.append('*');
            }
            System.out.println(sb.toString());
        }
    }
}