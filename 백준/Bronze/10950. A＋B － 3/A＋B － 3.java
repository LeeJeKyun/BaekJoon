import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        int[] sumArr = new int[testNum];
        
        for(int i=0; i<testNum; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sumArr[i]=a+b;
        }
        
        for(int i=0; i<sumArr.length; i++){
            System.out.println(sumArr[i]);
        }
        
        
        
    }
}