import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger x = sc.nextBigInteger();
		BigInteger y = sc.nextBigInteger();
		
		System.out.println(x.divide(y));
        System.out.println(x.remainder(y));
		
		sc.close();
	}
}