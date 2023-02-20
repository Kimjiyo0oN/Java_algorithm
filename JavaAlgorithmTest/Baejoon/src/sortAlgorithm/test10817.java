package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test10817 {
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(SB.readLine()," ");
		int[] output = new int[st.countTokens()]; 
		int i = 0;
		while(st.hasMoreTokens()) {
			output[i]= Integer.parseInt(st.nextToken());
			if(i > 0) {
				if(output[i-1] < output[i]) {
					int temp;
					temp = output[i-1];
					output[i-1] = output[i];
					output[i] = temp;
					if(i==2) {
						if(output[0] < output[1]) {
							int temp2;
							temp2 = output[0];
							output[0] = output[1];
							output[1] = temp2;
						}
					}
				}
			}
			i++;
		}
		SW.write(output[1]+"\n");
		SW.close();
		
	}
}
