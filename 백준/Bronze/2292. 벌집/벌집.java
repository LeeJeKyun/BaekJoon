import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		//input이 0보다 작아지기 직전까지 1 6 12 18 ... (6의 배수) 들을 빼준다
		//0보다 작거나 같아진 순간에 뺀 횟수가 타일의 수가 된다
		
		int n=0;
		
		input -= 1;
		
		while(true) {
			
			n++;
			
			if( input<=0 ) {
				break;
			}
			
			input -= 6*n;
			
			
		}
		
		System.out.println( n );

	}

}
