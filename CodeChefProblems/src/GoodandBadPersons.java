import java.util.Scanner;

public class GoodandBadPersons {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int L = sc.nextInt();
			int K = sc.nextInt();
			String message = sc.next();
			int countU = 0, countL = 0;
			char[] c = message.toCharArray();
			for(int i = 0; i < L;i++){
				if(message.charAt(i) >= 97 && message.charAt(i)<=122){
					countL++;
				}
				if(message.charAt(i) >= 65 && message.charAt(i)<=90){
					countU++;
				}
 			}
			if(countL > countU)
			{
				if(countU<=K)
					System.out.println("chef");
			}else if(countL<=K){
				System.out.println("brother");
			}else{
				System.out.println("both");
			}
		}
	}
}
