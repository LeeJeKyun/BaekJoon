import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] seq = new int[N];
        for(int i=0; i<N; i++){
            seq[i] = sc.nextInt();
        }
        
        for(int i=0; i<N; i++){
            if(seq[i]<X){
                System.out.print(seq[i] + " ");
            }
        }
        
        
    }
}