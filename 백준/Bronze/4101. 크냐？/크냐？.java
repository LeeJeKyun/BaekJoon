import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        
        while(a!=0||b!=0){
            
            if(a<=b){
                str += "No\n";
            }
            else{
                str += "Yes\n";
            }
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.println(str);
        
        
    }
}