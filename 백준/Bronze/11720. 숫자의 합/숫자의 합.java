import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //자릿수입력
        int num = sc.nextInt();
        sc.nextLine();
        
        //문자열로 숫자 받기
        String str = sc.nextLine();
        String[] strArr = str.split("");
        int result = 0;
        
        for(int i=0; i<str.length(); i++) {
        	result += Integer.parseInt(strArr[i]);
        }
        
        System.out.print(result);

        
    }
}