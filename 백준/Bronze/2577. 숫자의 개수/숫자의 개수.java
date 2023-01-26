import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numScore = new int[10];    //0~9자연수가 몇번 나왔는지 카운트하는 배열
        int a = sc.nextInt();            //입력 자연수 3개
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int num = a*b*c;                //세 자연수의 곱
        
        int digit = 0;                  //자릿수를 의미
        while(true){
            digit = num%10;            //digit에 num의 일의자릿수를 대입
            switch(digit){    //일의 자릿수가 0~9사이일때 각각의 자리에 대입
                case 0 : numScore[0]++;
                    break;
                case 1 : numScore[1]++;
                    break;
                case 2 : numScore[2]++;
                    break;
                case 3 : numScore[3]++;
                    break;
                case 4 : numScore[4]++;
                    break;
                case 5 : numScore[5]++;
                    break;
                case 6 : numScore[6]++;
                    break;
                case 7 : numScore[7]++;
                    break;
                case 8 : numScore[8]++;
                    break;
                case 9 : numScore[9]++;
                    break;
            }
            num /= 10;    //num의 일의 자릿수 소거
            if(num==0){
                break;
            }
        }
        for(int i=0; i<numScore.length; i++) {
        	System.out.println(numScore[i]);
        }
        
    }
}