import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	
    	int[] bsk = new int[N];
    	for(int i=0; i<N;i++) {
    		bsk[i]= i+1; 
    	}
    	
    	for(int k=0;k<M;k++) {
    		int i =sc.nextInt();
    		int j =sc.nextInt();
    		
    		while (i < j) {
                int temp = bsk[i - 1];
                bsk[i - 1] = bsk[j - 1];
                bsk[j - 1] = temp;
                i++;
                j--;
    		}
    	}
    	for(int i=0; i<N;i++)
    	System.out.print(bsk[i]+" ");
    		
    	sc.close();
    }
}