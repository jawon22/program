import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int input =sc.nextInt();
    	int total=0;
    	int[] arr = new int[input];
    	
    	for(int i=0;i<input;i++) {
    		int a=sc.nextInt();
    		arr[i] =a;
    		total += arr[i];
    	}
    	System.out.println(total);
    	sc.close();
    }
}