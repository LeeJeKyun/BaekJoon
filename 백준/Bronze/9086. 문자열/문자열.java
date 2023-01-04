import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<>();
  //-------------------------------------------------------------------------------------------      
        int actNum = sc.nextInt();    //입력된 숫자만큼, 그 다음 입력한
        sc.nextLine();
        for(int i=1; i<=actNum; i++){    //문자열을 ArrayList에 추가한다
            strs.add(sc.nextLine());
        }
        for(int i=0; i<strs.size(); i++){ //strs의 크기만큼 반복하며
            String strP = strs.get(i);    //strP변수는 0번 인수부터 끝 인수까지 순서대로 가지며
            //처음과 마지막 문자를 출력한다.
            System.out.println(strP.charAt(0)+""+(strP.charAt(strP.length()-1))); 
        }
        
    }
            
}
