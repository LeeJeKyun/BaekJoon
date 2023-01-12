import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer token = new StringTokenizer(str, " ");
        System.out.println(token.countTokens());
        /*String.split으로 접근했었으나 예제 입력 2번의 앞에 공백으로 인해 단어의 개수보다 1개가 늘어나서
        접근이 되었다. StringKokenizer를 활용하는 것이 문제의 의도인듯 하다*/
        
    }
}