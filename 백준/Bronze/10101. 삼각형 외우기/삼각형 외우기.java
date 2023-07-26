import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if (x > 1 && y > 1 && z > 1 && x < 180 && y < 180 && z < 180) {
			int total = x + y + z;

			if (x == 60 && y == 60 && z == 60)
				System.out.println("Equilateral");
			else if (total == 180 && (x == y || x == z || y == z))
				System.out.println("Isosceles");
			else if (total == 180 && (x != y || x != z || y != z))
				System.out.println("Scalene");
			else
				System.out.println("Error");
		}
		sc.close();
	}
}