import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 2;
		sc.close();
		
		while (true) {
			if(N==1) break;
			if(N%count==0) {
				N /= count;
				System.out.println(count);
			}
			else count++;
		}
	}
}