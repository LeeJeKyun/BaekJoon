//첫 입력으로 for문의 실행횟수를 결정한다
//for문 속에서 정수를 입력받아 arrayList에 추가한다
//for문을 사용하여 arraylList의 길이만큼 시행하며 찾으려는 정수와 비교한다.
//비교하여 같은 정수가 있는 경우에 결과의 값에 1을 추가한다.
//결과 값을 출력한다.

import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> count = new ArrayList<>();
        int trial = sc.nextInt();
        
        for(int i=0; i<trial; i++){
            count.add(sc.nextInt());
        }
        
        int compare = sc.nextInt();
        int result = 0;
        
        for(int i=0; i<count.size(); i++){
            
            if(count.get(i)==compare){
                result++;
            }
            
        }
        System.out.println(result);
        
        
    }
}