package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test25305 {
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st = new StringTokenizer(SB.readLine()," ");
		int count = Integer.parseInt(st.nextToken()); //응시자 수 
		int result = Integer.parseInt(st.nextToken()); // 상을 받는 사람의 수 
		
		int[] output = new int[count];
		StringTokenizer op = new StringTokenizer(SB.readLine()," ");
		for(int i =0; i<count;i++) {
			output[i] = Integer.parseInt(op.nextToken());
		}
		for(int i = count; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(j != count-1) {
					if(output[j]< output[j+1]) {
						int temp;
						temp = output[j];
						output[j] = output[j+1];
						output[j+1] = temp;
					}
				}
			}
			
		}
		SW.write(output[result-1]+"\n");	
		
		SW.close();
	}
}
