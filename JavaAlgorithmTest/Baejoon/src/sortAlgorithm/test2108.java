package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test2108 {    //시간초과
	public static int[] result = new int[4];
	public static void resultArray(int[] arr) {
		for(int j : arr) {
			result[0] += j;
		}
		if(result[0] >=0) {
			result[0]= Math.round(result[0]/(float)arr.length);
		}else {
			result[0]= -Math.round(Math.abs(result[0]/(float)arr.length));
		}
		
		Arrays.sort(arr);
		result[1] = arr[(int)(arr.length/2)];
		result[3] = arr[arr.length-1]-arr[0];
		int[] counting = new int[arr.length];
		boolean flag = true;
		for(int i=0;i<arr.length;i++ ) {
			flag = true;
			if(i==0) {
				counting[0] = 1;
			}else {
				for(int j=0;j<i;j++) {
					if(arr[i]== arr[j]) {
						counting[j]+=1;
						flag = false;
						break;
					}
				}
				if(flag) {
					counting[i] = 1;
				}
			}
		}
		int max =0;
		int[] index = new int[arr.length+1];
		int c = 0;
		for(int i=0;i<counting.length;i++ ) {
			if(i == 0) {
				max = counting[i];
				c = 1;
				index[c] = i;
			}else {
				if(max < counting[i]) {
					max = counting[i];
					c= 1;
					index[c] = i;
				}else {
					if(max == counting[i]) {
						c++;
						index[c] = i;
					}
				}
				
			}
		}
		
		if(c == 1) {
			result[2] = arr[index[1]];
		}else {
			int[] r = new int[c];
			for(int i = 1; i <= c; i++) {
				r[i-1] = arr[index[i]];
			}
			Arrays.sort(r);
			result[2] = r[1];
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
