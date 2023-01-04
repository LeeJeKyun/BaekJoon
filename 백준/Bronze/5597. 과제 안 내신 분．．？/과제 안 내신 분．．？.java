import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
    	
    	int students = 30;
    	int reports = 28;
    	
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> studentNum = new ArrayList<>();
       
        
        //studentNum이라는 int배열에 학생번호를 입력해준다.
        for(int i=1; i<=students; i++){
            studentNum.add(i);
        }
        
        //레포트 제출 개수만큼 입력을 받는다. 입력을 받는 동시에 학생번호 배열의 1~30번까지 중 같은 숫자가 있는지 확인하고
        //만약 같은 숫자가 있는 경우 그 배열의 숫자를 제거한다. 제거 후엔 비교하는 반복을 빠져나온다.
        for(int i=0; i<reports;i++){
        	int num = sc.nextInt();
            for(int j=0; j<30; j++){
                if(num==studentNum.get(j)){
                    studentNum.remove(j);
                    break;
                }
            }   
        }
        //제출 후 남은 학생의 숫자만큼 번호를 출력한다.
        for(int i=0; i<studentNum.size(); i++){
            System.out.println(studentNum.get(i));
        }

    }
}