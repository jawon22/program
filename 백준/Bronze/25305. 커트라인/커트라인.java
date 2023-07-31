import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[N];

		if (N >= 1 && N <= 1000) {
			for (int i = 0; i < N; i++) {
				int input = sc.nextInt();
				arr[i] = input;
			}
		Arrays.sort(arr);
		}
		System.out.println(arr[N-k]);
		sc.close();
	}
}