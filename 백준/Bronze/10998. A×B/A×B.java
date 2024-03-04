import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        int a = System.in.read()-48;
        int z = System.in.read();
        int b = System.in.read()-48;
        System.out.println(a*b);
    }
}