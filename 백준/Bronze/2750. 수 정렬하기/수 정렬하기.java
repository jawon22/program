import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> list = new TreeSet<>();

		if (N >= 1 && N <= 1000) {
			for (int i = 0; i < N; i++) {
				int input = sc.nextInt();
					list.add(input);
			}
			sc.close();
			for (int a : list)
				System.out.println(a);
		}
	}
}