import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] remain = new int[10];
        int count = 1;
        
        for(int i=0; i<10; i++){
            remain[i] = (sc.nextInt()%42);
        }
        Arrays.sort(remain);
        
        for(int i=0; i<9; i++){
            if(remain[i] != remain[i+1]){
                count++;
            }
        }
        System.out.print(count);
        
        
        
    }
}