import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int[] arr = new int[5];
		
		for(int i =0; i<5;i++) {
			int input =sc.nextInt();
			total +=input;
			arr[i] = input;
		}
		Arrays.sort(arr);
		System.out.println(total/5);
		System.out.println(arr[2]);
		sc.close();
	}
}