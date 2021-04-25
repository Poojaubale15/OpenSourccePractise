import java.util.Scanner;

public class EncodingMessage {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int L = sc.nextInt();
			String s = sc.next();
			
			char[] JavaCharArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
					'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			String alpha = "abcdefghijklmnopqrstuvwxyz";
			String swaped = "";
			char[] x = s.toCharArray();
			for (int i = 0; i < L - 1; i = i + 2) {
				char temp = x[i];
				x[i] = x[i + 1];
				x[i + 1] = temp;
			}
			for (int i = 0; i < L; i++) {
				swaped = swaped + Character.toString(x[i]);
			}
			for (int i = 0; i < swaped.length(); i++) {
				int c = alpha.indexOf(swaped.charAt(i));
				System.out.print(JavaCharArray[(25 - c)]);
			}
		}
	}
}
