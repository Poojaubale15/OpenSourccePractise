import java.util.Scanner;

public class Weight {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
			int w1 = sc.nextInt();
			int w2 = sc.nextInt();
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int m = sc.nextInt();
			
			int difference = w2-w1;
			int max = 0;
			int min = x1*x2;
			if(x1>x2) max = x1*x1;
			else max = x2*x2;
			
			if(difference < min || difference > max)
				System.out.println(0);
			else if(difference ==  min || difference <=max)
				System.out.println(1);
		}
	}
}
