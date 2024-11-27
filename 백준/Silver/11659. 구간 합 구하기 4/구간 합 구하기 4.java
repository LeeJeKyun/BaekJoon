import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        long[] sArr = new long[length + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=length; i++) {
            sArr[i] = sArr[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int r=0; r<count; r++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sArr[j] - sArr[i-1]);
        }
    }
}