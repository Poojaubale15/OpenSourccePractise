import java.util.Scanner;
/*Not yet complete*/
public class CHNGIT {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			
			int n = s.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++){
				arr[i] = s.nextInt();
			}
			
			for(int i = 0; i < n; i++){
				if(arr[i] != arr[i+1]){
					
				}
			}
		}
	}
}
