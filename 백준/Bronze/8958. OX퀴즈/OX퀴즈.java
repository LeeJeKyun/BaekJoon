
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    //OX입력횟수
        sc.nextLine();
        String[] oxNum = new String[num];	//OX입력된 문자열배열
        
        
        //입력횟수만큼 OX문자열을 배열에 넣는다.
        for(int i=0; i<oxNum.length; i++){
        	oxNum[i] = sc.nextLine();
        }
        
        int totalScore=0;
        int oNum = 0;
        
        
        for(int i=0; i<oxNum.length; i++) {
        	
        	//i번째 요소의 길이만큼 반복
        	for(int j=0; j<oxNum[i].length(); j++) {
        		
        		//i번 문자열의 j번째 문자가 O면 oNum에 1을 더하고 totalScore에 oNum을 더한다
        		if(oxNum[i].charAt(j)=='O') {
        			
        			oNum++;
        			totalScore += oNum;
        			
        		//i번 문자열의 j번째 문자가 X이면 oNum이 0으로 초기화 된다.
        		} else if(oxNum[i].charAt(j)=='X') {
        			oNum=0;
        		}
        	}
        	//반복 후에 출력 그리고 초기화
    		System.out.println(totalScore);
    		totalScore =0;
    		oNum=0;
        }
        
    }
}