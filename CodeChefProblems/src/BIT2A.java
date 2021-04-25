import java.util.ArrayList;
import java.util.Scanner;

/* You are given a sorted list A of size N.You have to make a new list B such that B[i] is equal to the number of elements strictly greater than A[i] in the list A. */
class BIT2A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			ArrayList<Integer> arr = new ArrayList<>();
			int count = 0;
			int N = sc.nextInt();
			for (int k = 0; k < N; k++) {
				int s = sc.nextInt();
				arr.add(s);
			}
			
			for (int i = 0; i < arr.size(); i++) {
				count = 0;
				for (int j = i + 1; j < arr.size(); j++) {
					if (arr.get(i) < arr.get(j)) {
						count++;
					}
				}
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
}
