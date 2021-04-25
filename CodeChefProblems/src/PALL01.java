import java.util.Scanner;
/* Pallindrome */
public class PALL01 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int N = sc.nextInt();
			int reverse = 0; int reminder = 0;
			int n = N;
			while(n!=0){
				reminder = n % 10;
				reverse = reverse * 10 + reminder;
				n = n/10;
			}
			
			if(reverse == N)
				System.out.println("wins");
			else
				System.out.println("loses");
		}
	}
}
