import java.util.Scanner;

public class MakingAMeal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int cC = 0, oC = 0, dC = 0, eC = 0, hC = 0, fC = 0;
			String s = null;
			for(int i = 0; i < N; i++){
				 s = s + sc.next();
			}
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == 'c') cC++;
				else if(s.charAt(i) == 'o') oC++;
				else if(s.charAt(i) == 'd') dC++;
				else if(s.charAt(i) == 'e') eC++;
				else if(s.charAt(i) == 'h') hC++;
				else  fC++;
			}
			System.out.println(cC + "" + oC + "" + dC + "" + eC + "" + hC + "" + fC );
		}
	}

}
