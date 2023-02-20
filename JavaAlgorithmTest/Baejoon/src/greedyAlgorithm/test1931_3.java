package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test1931_3 {
	static int greedy(int[][] arr) {
		int result=0;
		boolean flag = true;
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j< arr.length-i-1; j++) {
				if(arr[j][1] > arr[j+1][1]) {
					int temp = arr[j][0];
					int temp2 = arr[j][1];
					arr[j][0] = arr[j+1][0];
					arr[j][1] = arr[j+1][1];
					arr[j+1][0] =temp;
					arr[j+1][1] =temp2;
					flag =false;
				}
			}
			if(flag) {
				break;
			}
		}
		
		
        int pre_sqd = 0;
        for(int i =0; i<arr.length; i++) {
            if(pre_sqd <= arr[i][0]) {
                pre_sqd = arr[i][1];
                result++;
            }
        }
		
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[][] meeting = new int[count][2];
		for(int i =0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}
		int result = greedy(meeting);
		bw.write(result+"\n");
		bw.close();
	}
}
