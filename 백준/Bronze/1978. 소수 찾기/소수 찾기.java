
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int res=0;
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		
		//arr에 값 저장하기
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			
			if(isItDecimal(arr[i])) {
				res++;
			}
			
		}
		System.out.println(res);
		
//		System.out.println(isItDecimal(sc.nextInt()));
		
	}
	
	public static boolean isItDecimal(int n) {
		
		for(int i=2; i<=n; i++) {
			
			if(i==n) {
				return true; //n까지 반복문이 진행되면 소수이다.
			}
			
			if(n==2) {
				return true; //입력된 n이 2이면 소수이다.
			} else if(n%i==0) {
				return false; //입력된 n보다 작은 정수 중 나머지가 0이 되는 수가 있다면 소수가 아니다. 
			}
			
		}
		
		return false;
	}
}