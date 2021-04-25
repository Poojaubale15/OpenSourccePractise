import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pawri {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 0;
		try {
			if (br.ready())
				t = Integer.parseInt(br.readLine());

			while (t-- > 0) {
				String s = br.readLine();
    		    s=s.replaceAll("party","pawri");
    		    System.out.println(s);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
