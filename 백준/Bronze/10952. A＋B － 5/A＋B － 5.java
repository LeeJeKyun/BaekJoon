import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //입력
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        
        while(true){ // 두번의 0을 받을때까지 반복해서 숫자를 받는다.
            a.add(sc.nextInt());
            b.add(sc.nextInt());
            if(a.get(a.size()-1)==0 && a.get(a.size()-1)==0)
            {
                break;
            }
            
            
            
        } //while 종료
        
        for(int i=0; i<a.size()-1;i++){
            System.out.println(a.get(i)+b.get(i));
        } //for 종료
        
        
        
    }//main() end
}// class end