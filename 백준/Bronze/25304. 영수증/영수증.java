import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int receipt = sc.nextInt();
        int kinds = sc.nextInt();
        int[] kindsSum = new int[kinds];
        
        for(int i=0; i<kinds; i++){
            int won = sc.nextInt();
            int count = sc.nextInt();
            kindsSum[i] = won*count;
        }
        int sum = 0;
        for(int i=0; i<kinds; i++){
            sum += kindsSum[i];
        }
        if(receipt == sum){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        
    }
}