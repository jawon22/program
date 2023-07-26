import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int[] array = new int[6];
		
		for(int i=0; i<5;i+=2) {
			int x= sc.nextInt();
			int y = sc.nextInt();
			
			array[i] =x;
			array[i+1] =y;
		}
		if(array[0]==array[2]) A=array[4];
		else if(array[0]==array[4]) A=array[2];
		else A=array[0];
		
		if(array[1]==array[3]) B=array[5];
		else if(array[1]==array[5]) B=array[3];
		else B=array[1];
		
		System.out.println(A+" "+B);
		sc.close();
	}
}