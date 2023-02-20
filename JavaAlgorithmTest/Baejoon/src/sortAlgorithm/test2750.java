package sortAlgorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test2750 {
	
	public static void sort(int[] arr,int count) {
		for(int i = count; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(j != count-1) {
					if(arr[j]> arr[j+1]) {
						int temp;
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		int count =Integer.parseInt(SB.readLine());
		int[] input = new int[count];
		
		for(int i = 0; i < count; i++) {
			input[i] = Integer.parseInt(SB.readLine());
		}
		sort(input, count);
		for(int i = 0; i < count; i++) {
			SW.write(input[i]+"\n");
		}
		SW.close();
		
	}
}
