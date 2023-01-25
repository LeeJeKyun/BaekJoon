import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subNum = sc.nextInt();    
        int[] subScore = new int[subNum];
        int total = 0;
        
        for(int i=0; i<subNum; i++){
            subScore[i] = sc.nextInt();
        }
        Arrays.sort(subScore);
        
        for(int i=0; i<subNum; i++){
            total += subScore[i];
        }
        
        System.out.print((double)total/(subScore[subNum-1])*100/subNum);
      
        
    }
}