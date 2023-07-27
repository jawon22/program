import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String input = sc.next();
    	int num = sc.nextInt();
    	int count=0;
    	String[] st = new String[num];
    	
    	for(int i=0; i<num;i++) {
    		String mbti = sc.next();
    		st[i] = mbti;
    		if(input.equals(st[i])) count++;
    	}
    	System.out.println(count);
    	sc.close();
    }
}