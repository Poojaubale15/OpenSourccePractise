import java.io.IOException;
import java.util.Scanner;

class RectangleIntoSquare {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long L = s.nextLong();
			long B = s.nextLong();
			long ans = 56897456;
			long area = L * B;
			for (int i = (int) Math.min(L, B); i >= 1; i--) {
				if ((L % i) == 0 && (B % i == 0)) {
					long h = area / (i * i);
					ans = h;
					break;
					// System.out.println("ans "+ans);
				}
			}
			System.out.println(ans);
		}
	}
}