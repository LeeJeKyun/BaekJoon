import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            int maxP = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[maxP]){
                    maxP = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[maxP];
            arr[maxP] = temp;
        }
        for(char i : arr){
            System.out.print(i);
        }
    }
}
