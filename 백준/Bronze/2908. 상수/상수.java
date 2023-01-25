import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        
        char[] n1Arr = num1.toCharArray();
        char[] n2Arr = num2.toCharArray();
        
        String n1 = "";
        String n2 = "";
        for(int i=2; i>=0; i--){
            n1 += n1Arr[i];
            n2 += n2Arr[i];
        }
        int number1 = Integer.parseInt(n1);
        int number2 = Integer.parseInt(n2);
        
        if(number1>number2){
            System.out.print(number1);
        } else{
            System.out.print(number2);
        }
        
        
        
    }
}