
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			//a가 0이 아닐때만 실행
			if(a != 0) {
				
				if(a==palindrome(a)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
				
			} else {	//a가 0이면 종료
				break;
			}
			
		}
		
	}
	
	public static int palindrome (int a) {
		
		String aStr = Integer.toString(a);
		
		char res[] = aStr.toCharArray();
		
		aStr="";
		
		for(int i=res.length-1; i>=0; i--) {
			
			aStr += res[i];
			
		}
//		System.out.println("palindrome : " + aStr);
		
		return Integer.parseInt(aStr);
	}
	
}
