import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] iArr = new int[3];
        String str = "";
        
        while(true){
            iArr[0] = sc.nextInt();
            iArr[1] = sc.nextInt();
            iArr[2] = sc.nextInt();
            Arrays.sort(iArr);
            if(iArr[0]==0 && iArr[1]==0 && iArr[2]==0){
                System.out.print(str);
                return;
            } else {
                if(iArr[0]*iArr[0] + iArr[1]*iArr[1] == iArr[2]*iArr[2]){
                    str += "right\n";
                } else{
                    str += "wrong\n";
                }
            }
        
        }
        
    }
}