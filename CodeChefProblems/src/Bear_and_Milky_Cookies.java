import java.util.Scanner;

public class Bear_and_Milky_Cookies {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int N = sc.nextInt();

			String[] str = new String[N];
			int cookie = 0, count = 0;

			for (int i = 0; i < N; i++) {
				str[i] = sc.next();
				if(str[i].equals("cookie")){
					cookie++;
				}
			}
			for (int i = 0; i < N-1; i++) {
				if(str[i].equals("cookie") && str[i+1].equals("milk")){
					count++;
				}
			}
			if(cookie == count)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
