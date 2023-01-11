import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열의 갯수
		
		int n = sc.nextInt(); //입력, 문자열의 개수
		String[] pw = new String[n]; //String타입 배열, 길이n
		String[] out = new String[n]; //String타입 배열, 길이n
		
		sc.nextLine();
		//입력을 pw배열의 요소에 대입한다
		for(int i=0; i<n; i++) {
			pw[i]=sc.nextLine();
		}
		
		//입력된 배열요소의 길이가 6자리이상 9자리이하인지
		//판단하고, 맞는 경우 출력 배열의 해당 인덱스에
		//yes를, 틀린 경우 해당 인덱스에 no를 대입한다.
		for(int i=0; i<n; i++) {
			if(pw[i].length()>=6 && pw[i].length()<=9) {
				out[i]="yes";
			} else {
				out[i]="no";
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(out[i]);
		}
		
		
	}
}