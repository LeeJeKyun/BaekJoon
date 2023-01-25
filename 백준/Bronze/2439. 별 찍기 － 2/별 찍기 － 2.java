import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int starNum = sc.nextInt();
        for(int i=1; i<=starNum; i++){
            for(int j=1; j<=starNum; j++){
                if((i+j)>starNum){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }
}