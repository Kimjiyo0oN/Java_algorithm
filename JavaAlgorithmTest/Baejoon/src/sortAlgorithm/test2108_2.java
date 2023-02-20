package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test2108_2 {
	public static int[] result = new int[4];
	public static void resultArray(int[] arr) {	
		Arrays.sort(arr);
		result[1] = arr[(int)(arr.length/2)];
		result[3] = arr[arr.length-1]-arr[0];
		int[] counting = new int[arr[arr.length-1]-arr[0]+1];
		boolean flag = true;
		for(int i=0;i<arr.length;i++ ) {
			result[0]+=arr[i];
			counting[arr[i]-arr[0]]+=1;
		}
		if(result[0] >=0) {
			result[0]= Math.round(result[0]/(float)arr.length);
		}else {
			result[0]= -Math.round(Math.abs(result[0]/(float)arr.length));
		}
		
		int max =0;
		int[] index = new int[arr.length+1];
		int c = 0;
		for(int i=0;i<counting.length;i++ ) {
			if(i == 0) {
				max = counting[i];
				c = 1;
				index[c] = i+arr[0];
			}else {
				if(max < counting[i]) {
					max = counting[i];
					c= 1;
					index[c] = i+arr[0];
				}else {
					if(max == counting[i]) {
						c++;
						index[c] = i+arr[0];
					}
				}
				
			}
		}
		
		if(c == 1) {
			result[2] = index[1];
		}else {
			result[2] = index[2];
		}
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int count = Integer.parseInt(SB.readLine());
		int[] output = new int[count];
		for(int i =0; i<count;i++) {
			output[i] = Integer.parseInt(SB.readLine());
		}
		resultArray(output);
		for(int j : result) {
			SW.write(j+"\n");
		}
		SW.close();
	}
}
