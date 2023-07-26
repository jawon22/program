import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] array = new int[4];
		
		if(x>=1&&y>=1&&w>=1&&h>=1&&x<=w-1&&y<=h-1&&w<=1000&&h<=1000) {
			array[0] = w-x;
			array[1] = h-y;
 			array[2] =x;
			array[3] =y;
		}
		Arrays.sort(array);
		System.out.println(array[0]);
		sc.close();
	}
}