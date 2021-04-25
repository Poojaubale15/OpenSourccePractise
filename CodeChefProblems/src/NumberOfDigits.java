
import java.util.Scanner;

class NumberOfDigits {
	public static void main(String[] args) throws java.lang.Exception {
		try {
			Scanner s = new Scanner(System.in);
			long n = s.nextLong();
			long digits = 0;
			while (n > 0) {
				n /= 10;
				digits++;
			}
			if (digits == 1)
				System.out.println(1);
			else if (digits == 2)
				System.out.println(2);
			else if (digits == 3)
				System.out.println(3);
			else
				System.out.println("More than 3 digits");
		} catch (Exception var9) {
		}
	}
}
