	
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char[] strA = str.toCharArray();
        for(int i=0; i<str.length();i++){
            if(Character.isUpperCase(strA[i]) == true){
                strA[i]=Character.toLowerCase(strA[i]);
            }
            else{
                strA[i]=Character.toUpperCase(strA[i]);
            }
            System.out.print(strA[i]);
        }
    }

}