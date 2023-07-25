import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 String a = sc.next();
		 sc.close();
		 int[] result = new int[a.length()];
		
		if(a.length()>=1 && a.length()<=20){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)>='a' && a.charAt(i)<='z')
                    result[i] = a.charAt(i) - 32;
                else
                   result[i] = a.charAt(i) + 32;
                }
            }
        for(int i=0;i<result.length;i++) {
        	System.out.print((char)result[i]);
        }
    }
}