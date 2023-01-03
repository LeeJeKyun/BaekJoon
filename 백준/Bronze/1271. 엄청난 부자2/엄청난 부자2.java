import java.util.Scanner;
import java.math.BigInteger;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        BigInteger a = new BigInteger(str1);
        BigInteger b = new BigInteger(str2);
        
        
        
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
        
    }
}