import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>=1 &&A<=100 && B>=1&& B<=100) {
			System.out.println(A*B);
		}
		sc.close();
	}
}