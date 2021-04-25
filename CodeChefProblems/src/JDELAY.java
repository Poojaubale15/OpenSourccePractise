import java.util.Scanner;
/* The difference between Submitted time and judgement time should not be greater than 5min*/
public class JDELAY {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
			int N = sc.nextInt();
			int total  = 0;
			for(int i = 0; i < N; i++){
				int s = sc.nextInt();
				int j = sc.nextInt();
				
				if((j-s)>5){
					total++;
				}
			}
			System.out.println(total);
		}
		
	}
}
