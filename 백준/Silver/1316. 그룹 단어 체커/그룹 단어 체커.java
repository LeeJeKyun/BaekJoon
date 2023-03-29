
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<String> list = new ArrayList<>(); 
		
		//결과값 저장 변수
		int res = 0;
		
		sc.nextLine();	//입력버퍼 비우기
		for(int i=0; i<n; i++) {
			
			list.add(sc.nextLine());
			
		}
		//입력된 단어 모두 저장
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println((i+1) + "번째 단어는 " +list.get(i));
//		}
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			
			if(check(str)==true) {
				res++;
			}
			
		}
		System.out.println(res);
		
		
		
	}
	
	public static boolean check(String str) {
		
		for(int i=0; i<str.length(); i++) {
			//str문자열의 각 문자들을 기준으로 잡는다.(i번째문자)
			
			//첫 등장 다른 문자 idx
			int diff = 0;
			
			//다른 문자가 나오는 idx 먼저 찾기
			for(int j=(i+1); j<str.length(); j++) {
				
				//기준문자와 그 이후의 문자인 j번째 문자가 다를경우
				if(str.charAt(i) != str.charAt(j)) {
					//첫 등장 다른 문자 저장(diff변수)
					diff=j;
					break;
				} else {
					continue;
				}
				
			}
			
			//다른 문자가 나와서 diff가 0이 아닐 경우
			if(diff!=0) {
			//다른문자가 나온 idx 이후에 같은 문자가 다시 나오는지 확인
				for(int j=diff; j<str.length(); j++) {
					
					//같은 문자가 나올 경우
					if(str.charAt(i) == str.charAt(j)) {
						return false;
					}
					
				}
			
			}
		}
		
		return true;
	}
	
	
}
