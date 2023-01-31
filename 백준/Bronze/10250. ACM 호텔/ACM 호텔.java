import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int floor = 0;
        int ho = 0;
        
        for(int i=0; i<loop; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(c%a == 0){
                floor = a;
                ho = c/a;
            } else{
                floor = c%a;
                ho = c/a +1;
            }
            System.out.println(floor*100+ho);
            
        }
        
    }
}