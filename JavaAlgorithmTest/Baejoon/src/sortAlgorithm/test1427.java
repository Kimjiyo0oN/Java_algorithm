package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test1427 {
	static int[] mergeSort(int[] s, int start, int end) {
		int[] result = new int[s.length];
		if(start >= end) return s;
		int m = (start+end)/2;
		mergeSort(s,start,m);
		mergeSort(s,m+1,end);
		
		int p = start;
		int q = m+1;
		int idx = p;
		while(p <= m || q<=end ) {
			if(q>end || (p <=m && s[p] > s[q]  )) {
				result[idx++] = s[p++];				
			}else {
				result[idx++] = s[q++];
			}
		}
		
		for (int i=start;i<=end;i++) {
        	s[i]=result[i];
        }
		
		return s;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String[] arrayS;
		arrayS = input.split("");
		int[] array = new int[arrayS.length];
		int j = 0;
		for(String s : arrayS) {
			array[j++] = Integer.parseInt(s);
		}
		mergeSort(array,0,array.length-1);
		for(int i: array) {
			bw.write(i+"");
		}
		bw.close();
	}
}
