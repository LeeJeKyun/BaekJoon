
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		//키보드입력 n
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int n = Integer.parseInt(a);
		
		int cycle = 0;	//반복횟수
		int result=n;		//새로운 수
		
		while(true) {	//무한루프
			if(result<10) {
				
				result = result*10+result;
				
			} else {
				
				int x =result/10;	//x는 n의 십의자리수
				int y =result%10;	//y는 n의 일의자리수
				int z = (x+y)%10;	//z는 n의 자릿수의 합에서 오른쪽의 수
				
				result = (y*10)+z;
				
			}
			cycle++;
			
			if(n==result) {	//새로운 수와 n이 같을때 break
				break;
			}
		}
		
		System.out.println(cycle);
		
	}

}