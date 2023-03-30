
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		
		//주어지는 숫자카드의 갯수 n
		int n = Integer.parseInt(st.nextToken());
		
		//주어지는 블랙잭 최대숫자 m
		int m = Integer.parseInt(st.nextToken());
		
		//카드숫자저장배열생성
		int card[] = new int[n];
		
		//숫자입력
		String cards = br.readLine();
		
		//숫자찢기
		StringTokenizer st2 = new StringTokenizer(cards);
		
		//배열에 입력된 숫자 저장
		for(int i=0; i<n; i++) {
			card[i]=Integer.parseInt(st2.nextToken());
		}
		
		List<Integer> sums = new ArrayList<>();
		
		//더하는로직 바꾸기
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					sums.add(card[i]+card[j]+card[k]);
				}
			}
		}
		
		Collections.sort(sums);
		int res = 0;
		
		for( Integer i : sums) {
			if(i<=m) {
				res = i;
			}
		}
		
		System.out.println(res);
		
		
	}
}
