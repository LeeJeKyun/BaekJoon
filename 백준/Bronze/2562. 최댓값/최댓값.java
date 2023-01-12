import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] so = new int[9];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.arraycopy(arr, 0, so, 0, 9);
        Arrays.sort(so);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==so[8]){
                System.out.println(arr[i] + "\n" + (i+1));
            }
        }
        
        
    }
}