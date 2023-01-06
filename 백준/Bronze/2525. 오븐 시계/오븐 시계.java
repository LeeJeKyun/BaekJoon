import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int howLong = sc.nextInt();
        
        int endTime = minute+howLong;
        
        hour += endTime/60;
        
        if(hour>=24){
            hour -= 24;
            endTime -= endTime/60*60;
            System.out.println(hour +" "+ endTime);
        } else{
            endTime -= endTime/60*60;
            System.out.println(hour + " " + endTime);
        }

    }
}