import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x1 = new int[N];
		int[] y1 = new int[N];
		
		for(int i =0;i<N;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			x1[i] =x;
			y1[i] =y;
		}
		Arrays.sort(x1);
		Arrays.sort(y1);
		
		if(x1.length==1 &&y1.length==1) System.out.println(0);
		else {
			int total = (x1[x1.length-1] -x1[0]) * (y1[y1.length-1] - y1[0]);
			System.out.println(total);
		}
		sc.close();
	}
}