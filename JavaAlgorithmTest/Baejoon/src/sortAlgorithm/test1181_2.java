package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test1181_2 {
	static String[] array;
	static String[] temp;
	static void mergeSort(int start, int end) {
		if(start >= end) return;
		int mid = (start+end)/2;
		mergeSort(start,mid);
		mergeSort(mid+1,end);
		int p = start;
		int q = mid+1;
		int idx = start;
		
		while(p <= mid || q <= end) {
			if(q > end || (p<= mid && array[p].length() < array[q].length())) {
				temp[idx++] = array[p++];
			}else {
				if(p > mid) {
					temp[idx++] = array[q++];
				}else if(array[p].length() == array[q].length()) {
					if(array[p].equals(array[q])) {
						temp[idx++] = array[p++];
					}else {
						for(int x= 0; x < array[p].length(); x++) {
							int char1 = array[p].charAt(x) - '0';
							int char2 = array[q].charAt(x) - '0';
							if(char1 > char2) {
								temp[idx++] = array[q++];
								break;
							}else {
								if(char1 < char2) {
									temp[idx++] = array[p++];
									break;
								}
							}
						}
					}
				}else {
					temp[idx++] = array[q++];
				}
			}
		}
		
		for(int i =start; i<=end;i++  ) {
			array[i] = temp[i];
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		array = new String[count];
		temp = new String[count];
		for(int i =0; i < count; i++) {
			array[i] = br.readLine();
		}	
		mergeSort(0,array.length-1);
		for(int i =0; i < count; i++) {
			if(i !=0 && array[i].equals(array[i-1])) {
				continue;
			}else {
				bw.write(array[i]+"\n");
			}
			
		}
		bw.close();
	}
}
