import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();    //문자열 입력
        char[] cArr = str.toCharArray();    //str의 문자들 하나하나 cArr배열에 대입
        //배열에 있는 문자들을 a~z까지 같은지 확인하고 있는 경우엔 배열의 인덱스를 출력
        //없는 경우엔 -1을 출력
        
        outLoop :
        for(int a=97; a<=122; a++){    //a는 a~z까지 아스키코드
            for(int i=0; i<cArr.length; i++){   //i는 문자배열의 인덱스
                if(a==(int)cArr[i]){    //i번째 인덱스와 알파벳이 같을 경우
                    System.out.print(i + " ");    //i를 출력한다
                    continue outLoop;    //다음 반복으로 넘어간다
                }
            }
            System.out.print((-1) + " ");
        }
        
    }
}
