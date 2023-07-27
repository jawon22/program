import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input =sc.next();
		
		if(input.equals("SONGDO")) System.out.println("HIGHSCHOOL");
		else if(input.equals("CODE")) System.out.println("MASTER");
		else if(input.equals("2023")) System.out.println("0611");
		else if(input.equals("ALGORITHM")) System.out.println("CONTEST");
		
	}
}