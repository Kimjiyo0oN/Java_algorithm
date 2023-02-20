package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test11047 {
	static int greedy(int[] arr,int value) {
		int result = 0;
		for(int i = arr.length-1; i >=0; i--) {
			if(value == 0) {
				break;
			}
			if(value >= arr[i]) {
				result+=(value/arr[i]);
				value-=arr[i]*(value/arr[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int count = Integer.parseInt(st.nextToken());
		int value = Integer.parseInt(st.nextToken());
		
		int[] input = new int[count];
		for(int i =0; i < count; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		bw.write(greedy(input,value)+"\n");
		bw.close();
	}
}
