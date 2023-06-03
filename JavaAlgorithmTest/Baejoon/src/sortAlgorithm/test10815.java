package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class test10815 {
	static int[] output;
	static int binarySearch(int key, int low, int high) {
		int mid;
		
		if(low <= high) {
			mid = (low + high) / 2;
			
			if(key == output[mid]) { // 탐색 성공 
				return 1;
			} else if(key < output[mid]) {
				return binarySearch(key ,low, mid-1); // 왼쪽 부분 탐색 
			} else {
				return binarySearch(key, mid+1, high); // 오른쪽 부분 탐색 
			}
		}
		
		return 0; // 탐색 실패 
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(SB.readLine());
		output = new int[count];
		StringTokenizer st = new StringTokenizer(SB.readLine()," ");
		for(int i =0; i<count;i++) {
			output[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(output);
		int coun2 = Integer.parseInt(SB.readLine());
		List<Integer> output2 = new ArrayList<Integer>();

		st = new StringTokenizer(SB.readLine()," ");
		for(int i =0; i<coun2;i++) {
			output2.add(Integer.parseInt(st.nextToken())); 
			SW.write(binarySearch(output2.get(i),0,output.length-1)+" ");
		}

		SW.close();
		
	}
}
