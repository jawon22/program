import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long input = sc.nextInt();
		if(input>=1&&input<=1000000000)
		System.out.println(input*4);
		
		sc.close();
	}
}