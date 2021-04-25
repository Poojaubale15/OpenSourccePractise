import java.util.Scanner;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int arr[] = new int[8];
			for (int i = 0; i < 8; i++) {
				arr[i] = 0;
			}
			for (int i = 0; i < n; i++) {
				int p = s.nextInt();
				int score = s.nextInt();
				if (p < 9) {
					if (arr[p - 1] < score) {
						arr[p - 1] = score;
					}
				}
			}
			int sum = 0;
			for (int i = 0; i < 8; i++) {
				sum += arr[i];
			}
			System.out.println(sum);
			t--;
		}

	}
}
