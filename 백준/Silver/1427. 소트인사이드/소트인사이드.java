import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	if(N>=1 && N<=1000000000) {
    		String strN= Integer.toString(N);
    		int[] num = new int[strN.length()];
    		for(int i=0;i<strN.length();i++) {
    			num[i] = Character.digit(strN.charAt(i),10);
    		}
    		Arrays.sort(num);
    		for(int j=num.length-1;j>=0;j--) System.out.print(num[j]);
    	}
    	sc.close();
    }
}