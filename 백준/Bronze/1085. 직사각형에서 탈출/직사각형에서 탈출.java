import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int[] distances = {w-x,h-y,x,y};
        Arrays.sort(distances);
        System.out.print(distances[0]);
        
    }
}