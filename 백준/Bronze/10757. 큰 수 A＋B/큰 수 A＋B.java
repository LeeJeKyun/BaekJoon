import java.util.Scanner;
import java.math.BigInteger;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.next());
        BigInteger num2 = new BigInteger(sc.next());
        
        System.out.println(num1.add(num2));
        
        
    }
}