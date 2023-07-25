import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int totalCount=0;
		
		for(int i=0; i<N;i++) {
			int count=0;
			int input = sc.nextInt();
			for(int j=1;j<=input;j++) {
				if(input%j ==0) count++;
			}
			if(count==2) totalCount++;
		}
		System.out.println(totalCount);
	}
}