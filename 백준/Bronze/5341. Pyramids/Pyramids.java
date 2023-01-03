import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pyramid = new ArrayList<>();
        
        for(int i=0; ; i++) {
        	
        	int num = sc.nextInt();
        	if(num == 0) {
        		break;
        	}
        	pyramid.add(num);
        }//어레이리스트가 생김.
        
        for(int i=0; i<pyramid.size(); i++) {
        	int sum = 0;
        	for(int j=0; j<pyramid.get(i); j++) {
        		sum += (j+1);
        	}
        	System.out.println(sum);
        }
        
        
    }
}