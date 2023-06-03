package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class test10816 {
	public static void main(String[] args) throws IOException{
			BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
			int count =Integer.parseInt(SB.readLine());
			Map<Integer, Integer> input = new HashMap<>();
					//new int[count];
			StringTokenizer st;
			st = new StringTokenizer(SB.readLine()," ");
			for(int i = 0; i < count; i++) {
				int temp = Integer.parseInt(st.nextToken());
				if(input.containsKey(temp)) {
					input.put(temp, input.get(temp)+1);
				}else {
					input.put(temp, 1);
				}
			}
			
			int count2 =Integer.parseInt(SB.readLine());
			int[] input2 = new int[count];
			st = new StringTokenizer(SB.readLine()," ");
			for(int i = 0; i < count2; i++) {
				int temp = Integer.parseInt(st.nextToken());
				if(input.containsKey(temp)) {
					SW.write(input.get(temp) +" ");
				}else {
					SW.write(0 +" ");
				}
				
			}
			SW.close();
	}
}
