package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test11650 {
	public static int[][] array;
	public static int[][] result;
	static void mergeSort(int start,int end){
		if(start >= end) return;
		int m = (start+end)/2;
		mergeSort(start, m);
		mergeSort(m+1, end);
		
		int p = start;
		int q = m+1;
		int idx = start; 
		
		while(p <= m || q <= end) {
			if(q > end ||(p <=m && array[p][0]< array[q][0])) {
				result[idx][0] = array[p][0];
				result[idx++][1] = array[p++][1];
			}else {
				if(array[p][0] == array[q][0]) {
					if(array[p][1] < array[q][1]) {
						result[idx][0] = array[p][0];
						result[idx++][1] = array[p++][1];	
					}else {
						result[idx][0] = array[q][0];
						result[idx++][1] = array[q++][1];
					}
				}else {
					result[idx][0] = array[q][0];
					result[idx++][1] =array[q++][1];
				}
				
			}
		}
		
		for(int j =start; j <= end; j++) {
			array[j][0] = result[j][0];
			array[j][1] = result[j][1];
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		array = new int[count][2];
		result = new int[count][2];
		for(int i = 0; i< count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		mergeSort(0, count-1);
		for(int[] x : array) {
			bw.write(x[0]+" "+x[1]+"\n");
		}
		bw.close();
	}
}
