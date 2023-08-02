import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String word = sc.next().toUpperCase();
    	
    	int[] arr = new int[26];
    	sc.close();  	
    	
    	for(int i=0;i<word.length();i++) {
    		if(word.charAt(i)>='A' && word.charAt(i)<='Z')
    			arr[word.charAt(i)-'A']++;
    	}
    	int max =0;
    	char ch ='?';
    	
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>max){
    			max =arr[i];
    			ch = (char)(i+'A');
    		}
    		else if(arr[i]== max) {
    			ch ='?';
    			}
    		}
    	System.out.println(ch);
    }
}