import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        if(Arrays.toString(arr).equals("[1, 2, 3, 4, 5, 6, 7, 8]")){
            System.out.println("ascending");
        } else if(Arrays.toString(arr).equals("[8, 7, 6, 5, 4, 3, 2, 1]")){
            System.out.println("descending");
        } else{
            System.out.println("mixed");
        }
        
    }
}