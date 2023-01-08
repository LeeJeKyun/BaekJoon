import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num*2];
        
        for(int i=0; i<num*2; i += 2){
            String[] innerNum = new String[2];
            String a = br.readLine();
            innerNum = a.split(" ");
            numbers[i] = Integer.parseInt(innerNum[0]);
            numbers[i+1] = Integer.parseInt(innerNum[1]);
        }
        for(int i=0; i<num*2; i += 2){
            int sum = numbers[i]+numbers[i+1];
            String result = Integer.toString(sum);
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        
    }    
}
