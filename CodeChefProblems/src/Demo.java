import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
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
			System.out.println();
			for (int i = 0; i < arr.size(); i++) {
				count = 0;
				for (int j = i + 1; j < arr.size(); j++) {
					if (arr.get(i) < arr.get(j)) {
						count++;
					}
				}
				System.out.print(count);
			}
		}
	}
}
