import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        if(hour!=0 && minute < 45){
            hour -= 1;
            minute = minute+15;
            System.out.print(hour + " " + minute);
        } else if(hour != 0 && minute>= 45){
            minute -= 45;
            System.out.print(hour + " " + minute);
        } 
        else if(hour==0 && minute <45){
            hour = 23;
            minute = minute+15;
            System.out.print(hour + " " + minute);
        } else if(hour==0 && minute>= 45){
            minute -= 45;          
            System.out.print(hour + " " + minute);
        }

        
    }
}