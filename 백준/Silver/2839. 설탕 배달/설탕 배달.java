import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int res = 0;
        
        while(true){
            if( n % 5 == 0){
                System.out.println(n/5 + res);
                break;
            } else if (n<0){
                System.out.println(-1);
                break;
            }
            n = n-3;
            res++;
        }
    }
}