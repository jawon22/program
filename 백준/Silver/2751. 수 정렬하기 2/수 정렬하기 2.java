import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
	
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
    	
    	if(N>=1&& N<=1000000) {
    		for(int i =0; i<N;i++) {
    			int input =sc.nextInt();
    			if(input<=Math.abs(1000000)) {
    				list.add(input);
    			}
    		}
    	}
    	Collections.sort(list);
    	for(Integer a:list) sb.append(a).append("\n");
    	sc.close();
    	System.out.println(sb);
	}
}