import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        for(int i=1; i<answer; i++){
        	int construct = 0;	//생성자
            construct += i;		//생성자에 i를 더한 후에
            int source = i;		//source라는 변수에 i를 대입해준다
            while(source!=0){	//source의 값이 0이 될때까지
                construct += source%10;	//생성자에 source의 1의자릿수를 대입하고
                source /= 10;			//source를 10으로 나누어 1의자릿수를 없애준다
            }
            if(construct == answer){
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}
