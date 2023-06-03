package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test2751 {
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		int count =Integer.parseInt(SB.readLine());
		int[] input = new int[count];
		for(int i = 0; i < count; i++) {
			input[i] = Integer.parseInt(SB.readLine());
		}
		Arrays.sort(input);
		for(int j : input) {
			SW.write(j +"\n");
		}
		
		SW.close();
		
	}
}
