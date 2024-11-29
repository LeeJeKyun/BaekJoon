import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        //입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int sp = 0;
        int ep = arr.length-1;
        while(sp < ep) {
            if(arr[sp] + arr[ep] > m) ep--;
            else if(arr[sp] + arr[ep] < m) sp++;
            else if(arr[sp] + arr[ep] == m) {
                sp++;
                ep--;
                ans++;
            }
        }
        
        System.out.println(ans);

    }
}