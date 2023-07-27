import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     
    	Scanner sc = new Scanner(System.in);
    	int total = 0;
    	int[] arr = new int[5];

    	for(int i = 0;i<5;i++) {
    		int input = sc.nextInt();
    		arr[i] = input;
     	}
    	for(int i=0;i<5;i++) total = total+ arr[i]*arr[i];
    	
    	System.out.println(total%10);
    	sc.close();
    }
}