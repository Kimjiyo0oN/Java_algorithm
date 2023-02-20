package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test10989 {
	public static int[] result;
	public static void countSort(int[] arr) {
		int temp =0;
		result = new int[arr.length];
		for(int i =0; i<arr.length;i++) {
			if(i == 0) {
				temp = arr[i];
			}
			if(temp < arr[i]) {
					temp = arr[i];
			}
		}
		int[] tempArr = new int[temp+1];
		for(int i =0; i<arr.length;i++) {
			/*
			 * for(int j =0; j<tempArr.length;j++) { if(arr[i] == j) { tempArr[j] += 1; } }
			 */
			tempArr[arr[i]] += 1;
		}
		for(int i =0; i<tempArr.length;i++) {
			if(i>0) {
				tempArr[i] += tempArr[i-1];
			}
		}
		
		for(int i = arr.length-1; i >=0; i--) {
			tempArr[arr[i]]--;
			result[tempArr[arr[i]]] = arr[i];
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
		countSort(output);
		for(int j : result) {
			SW.write(j+"\n");
		}
		SW.close();
		
	}
}
