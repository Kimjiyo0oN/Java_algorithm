package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class test14425 {
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(SB.readLine()," ");
		
		int count = Integer.parseInt(st.nextToken());
		int count2 = Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer> output = new HashMap<String,Integer>();
		for(int i =0; i<count;i++) {
			output.put(SB.readLine(),i); 
		}
		String[] output2 = new String[count2];
		for(int i =0; i<count2;i++) {
			output2[i]=(SB.readLine()); 
			
		}
		int result = 0;
		for(String s : output2) {
			if(output.containsKey(s))result++;
			
			
		}
		SW.write(result+"\n");

		SW.close();
	}
}
