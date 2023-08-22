import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		for(int i=1; i<=arr[0]; i++) {
			int count = 0;
			
			for(int j=0; j<n; j++) {
				if(arr[j] % i == 0)
					count ++;
			}
			

			if(count == n)
				System.out.println(i);
		}
		
		
		bf.close();
	}

}
