import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Integer> list = List.of(1,1,2,2,2,8);
    	int[] answer = new int[6];
    	
    	for(int i=0;i<list.size();i++) {
    		int input = sc.nextInt();
    		answer[i]= list.get(i) -input;
    	}
    	for(int i=0 ;i<answer.length;i++) System.out.print(answer[i]+" ");
    }
}