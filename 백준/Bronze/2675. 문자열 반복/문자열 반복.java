import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        String[] strArr = new String[testNum];
        for(int i=0; i<testNum; i++) {
        	strArr[i] = "";
        }
        
        sc.nextLine();
        for(int i=0; i<testNum; i++){
            int num = sc.nextInt();        //반복횟수 입력
            String str = sc.next();     //문자열 입력
            char[] charArr = str.toCharArray();    //char[]생성하여 str의 문자배열 대입
            //반복횟수만큼 각 배열의 요소들 출력하기
            for(char c : charArr){
                for(int j=0; j<num; j++){
                    strArr[i] += c;
                }
            }
        }
        for(int i=0; i<testNum; i++) {
        	System.out.println(strArr[i]);
        }
        
    }
}