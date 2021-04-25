
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse_number {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int number = sc.nextInt();
			int reverse = 0;
			while (number > 0) {
				reverse = reverse * 10 + number % 10;
				number = number / 10;
			}
			System.out.println(reverse);
		}
	}
}
