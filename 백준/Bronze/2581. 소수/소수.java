import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int total=0;

		if (M <= N && M >= 1 && M <= 10000 && N >= 1 && N <= 10000) {
			for(int i = M; i <= N; i++) {
				int count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						count++;
				}
				if(count==2) {
					total +=i; list.add(i);
				}
			}
			if(total>0) {
				System.out.println(total);
				System.out.println(list.get(0));
			}
			else System.out.println(-1);
		}
		sc.close();
	}
}