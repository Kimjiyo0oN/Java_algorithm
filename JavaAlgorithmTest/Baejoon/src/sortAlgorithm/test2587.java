package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test2587 {
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] output = new int[5];
		int result = 0;
		for(int i =0; i<5;i++) {
			output[i] = Integer.parseInt(SB.readLine());
			result += output[i];
		}
		Arrays.sort(output);
		SW.write(result/output.length+"\n");
		SW.write(output[2]+"\n");	
		SW.close();
	}
}
