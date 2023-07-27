import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     
    	Scanner sc = new Scanner(System.in);
    	String input = sc.next();
    	
    	for(int i =0; i<input.length();i++) {
    		if(input.charAt(i)>='a' && input.charAt(i)<='z') {
    			System.out.print((char)(input.charAt(i)-32));
    		}
    		else if(input.charAt(i)>='A' && input.charAt(i)<='Z') 
    			System.out.print((char)(input.charAt(i)+32));
    	}
    	sc.close();
    }
}