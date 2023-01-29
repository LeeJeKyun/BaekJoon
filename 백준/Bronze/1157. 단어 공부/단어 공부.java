import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String upStr = str.toUpperCase();
        char[] sArr = upStr.toCharArray();
        Arrays.sort(sArr);
        int dNums = 1;
        
        for(int i=0; i<sArr.length-1; i++){
            if(sArr[i] != sArr[i+1]){
                dNums++;
            }
        }
        int[] dif = new int[dNums];
        for(int i=0; i<dif.length; i++){
            dif[i] = 1;
        }
        
        int n = 0;
        
        for(int i=0; i<sArr.length-1; i++){
            if(sArr[i] == sArr[i+1]){
                dif[n]++;
            } else{
                n++;
            }
        }
        
        int max = 0;
        int max2 = 0;
        int maxIndex = 0;
        for(int i=0; i<dif.length; i++){
            if(dif[i] == max){
                max2 = max;
            } else if(dif[i] > max){
                max = dif[i];
                maxIndex=i;
            }
        }
        int index = 0;
        for(int i=0; i<=maxIndex; i++){
            index += dif[i];
        }
        if(max == max2){
            System.out.print("?");
        }else {
            System.out.print(sArr[index-1]);
        }
        
        
        
        
        
    }
}