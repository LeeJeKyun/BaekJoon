import java.text.*;
import java.util.Date;

class Main{
    public static void main(String[] args){
        
        Date now = new Date();
        
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
        
        String formated = formatter.format(now);
        System.out.println(formated);
        
    }
}