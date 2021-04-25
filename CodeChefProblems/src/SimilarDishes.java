import java.util.HashMap;
import java.util.Scanner;

public class SimilarDishes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			HashMap<String, Integer> map = new HashMap<>();
			int value = 1, count = 0;

			for (int i = 0; i < 4; i++) {
				String s = sc.next();
				map.put(s, value);
			}
			for (int i = 0; i < 4; i++) {
				String s = sc.next();
				if (map.containsKey(s)) {
					value = map.get(s);
					value++;
					count++;
				}
			}
			if(count >= 2){
				System.out.println("similar");
			}else{
				System.out.println("dissimilar");
			}

		}
	}

}
