import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* Attendance, Similar name - Full name, Unique name - first name */
class Names {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			ArrayList<String> first_names = new ArrayList<String>();
			ArrayList<String> full_name = new ArrayList<String>();
			Map<String, Integer> m = new HashMap<String, Integer>();
			int count = 1;
			String first = "", second = "", list = "";
			for (int i = 0; i < n; i++) {
				first = sc.next();
				second = sc.next();
				list = first + " " + second;
				first_names.add(first);
				full_name.add(list);
				if (!m.containsKey(first))
					m.put(first, count);
				else
					m.replace(first, m.get(first) + 1);
			}

			Set s1 = m.entrySet();
			Iterator<?> itr = s1.iterator();

			for (int i = 0; i < first_names.size(); i++) {
				if (m.containsKey(first_names.get(i)))	 {
					if (m.get(first_names.get(i))>= 2) {
						System.out.println(full_name.get(i));
					} else {
						System.out.println(first_names.get(i));
					}	
				}
			}
		}
	}
}
