import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int count = sc.nextInt();
        int[] iArr = new int[length];
        for(int i=0; i<length; i++) {
            iArr[i] = sc.nextInt();
        }

        int[] sArr = new int[length];
        for(int i=0; i<length; i++) {
            if(i==0) {
                sArr[i] = iArr[i];
            } else {
                sArr[i] = sArr[i-1] + iArr[i];
            }
        }

        int[] answer = new int[count];

        for(int i=0; i<count; i++) {
            int j = sc.nextInt() - 1;
            int k = sc.nextInt() - 1;
            if(j<=0) answer[i] = sArr[k];
            else answer[i] = sArr[k] - sArr[j-1];
        }
        for(int a : answer) {
            System.out.println(a);
        }

    }
}