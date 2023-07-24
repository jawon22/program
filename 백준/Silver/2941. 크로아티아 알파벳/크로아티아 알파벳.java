import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input =sc.next();
		sc.close();
		
		String[] Alphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		for(int i =0;i<Alphabet.length;i++) {
			if(input.contains(Alphabet[i])) {
				input = input.replace(Alphabet[i], " ");
			}
			
		}
		System.out.println(input.length());
		
	}
}