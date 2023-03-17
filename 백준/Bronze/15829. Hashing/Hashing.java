import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		
		String input2 = sc.next();
		
		BigInteger hashOut = new BigInteger("0");
		
		//input1번 반복
		for(int i=0; i<input1; i++ ) {
			
			BigInteger input2B = new BigInteger(Integer.toString((input2.codePointAt(i)-96)));
			
			BigInteger M = new BigInteger("1234567891");
			
			//pow는 31의 i거듭제곱인 수를 나타낸다.
			BigInteger pow = (new BigInteger("31")).pow(i);
			
			hashOut = hashOut.add( (pow).multiply(input2B).mod(M) );
			
			
			
		}
		
		System.out.println( hashOut );
		

	}

}