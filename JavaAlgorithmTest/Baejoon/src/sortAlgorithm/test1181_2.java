package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test1181_2 {
	static String[] array;
	static void mergeSort(int start, int end) {
		if(start >= end) return;
		int mid = (start+end)/2;
		mergeSort(start,mid);
		mergeSort(mid+1,end);
		int p = start;
		int q = mid+1;
		int idx = start;
		
		w
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		array = new String[count];
		
		for(int i =0; i < count; i++) {
			array[i] = br.readLine();
		}
		mergeSort(0,array.length-1);
		for(int i =0; i < count; i++) {
			bw.write(array[i]+"\n");
		}
		bw.close();
	}
}
