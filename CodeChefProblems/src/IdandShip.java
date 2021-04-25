import java.util.Scanner;

public class IdandShip {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			char c = sc.next().charAt(0);

			switch (c) {
			case 'b':
			case 'B':
				System.out.println("BattleShip");
				break;

			case 'c':
			case 'C':
				System.out.println("Cruiser");
				break;

			case 'd':
			case 'D':
				System.out.println("Destroyer");
				break;

			case 'f':
			case 'F':
				System.out.println("Frigate");
				break;

			}
		}

	}

}
