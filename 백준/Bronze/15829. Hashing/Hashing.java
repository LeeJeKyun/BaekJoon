import java.util.Scanner;

class Main {
    public static void main(String[] args){
        		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		
		String input2 = sc.next();
		
		long hashOut = 0;
		
		//input1번 반복
		for(int i=0; i<input1; i++ ) {
			
			long pow = (int)Math.pow(31, i);
			hashOut += (input2.codePointAt(i)-96)*(pow);
			
		}
		
		System.out.println( hashOut );
		
    }
}