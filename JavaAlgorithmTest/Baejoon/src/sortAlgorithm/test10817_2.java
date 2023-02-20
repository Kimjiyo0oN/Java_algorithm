package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class test10817_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(SB.readLine()," ");
		Integer output[] = new Integer[st.countTokens()]; 
		int i = 0;
		while(st.hasMoreTokens()) {
			output[i]= Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(output,Collections.reverseOrder());
		SW.write(output[1]+"\n");
		SW.close();
		
	}
}
