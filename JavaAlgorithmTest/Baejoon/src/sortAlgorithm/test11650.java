package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test11650 {
	static int[][] mergeSort(int[][] i,int start,int end){
		int[][] result = new int[i.length][i[0].length];
		if(start >= end) return i;
		int m = (start+end)/2;
		mergeSort(i, start, m);
		mergeSort(i, m+1, end);
		
		int p = start;
		int q = m+1;
		int idx = start; 
		
		while(p <= m || q <= end) {
			if(q > end ||(p <=m && i[p][0]< i[q][0])) {
				result[idx][0] = i[p][0];
				result[idx++][1] = i[p++][1];
			}else {
				if(i[p][0] == i[q][0]) {
					if(i[p][1] < i[q][1]) {
						result[idx][0] = i[p][0];
						result[idx++][1] = i[p++][1];	
					}else {
						result[idx][0] = i[q][0];
						result[idx++][1] = i[q++][1];
					}
				}else {
					result[idx][0] = i[q][0];
					result[idx++][1] = i[q++][1];
				}
				
			}
		}
		
		for(int j =start; j <= end; j++) {
			i[j][0] = result[j][0];
			i[j][1] = result[j][1];
		}
		
		return i;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[][] array = new int[count][2];
		for(int i = 0; i< count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		array = mergeSort(array, 0, count-1);
		for(int[] x : array) {
			bw.write(x[0]+" "+x[1]+"\n");
		}
		bw.close();
	}
}
