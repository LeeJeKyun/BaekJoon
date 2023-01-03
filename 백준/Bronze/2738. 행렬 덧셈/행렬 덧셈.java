	
import java.util.Scanner;

class Main{
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[][] procession1 = new int[a][b];
		int[][] procession2 = new int[a][b];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				procession1[i][j]=sc.nextInt();
			}
		}	
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				procession2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(procession1[i][j]+procession2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}