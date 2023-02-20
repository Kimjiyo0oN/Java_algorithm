package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test1931_4 {
	public static int[][] meeting;
    public static int[][] tmp;
	static void mergeSort(int start, int end) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid); //재귀함수
            mergeSort(mid+1, end); //재귀함수

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q<=end && (p>mid || meeting[p][1]>=meeting[q][1])) {
                	if(meeting[p][1]==meeting[q][1]) {
                		if(meeting[p][0]>=meeting[q][0] || p>mid) {
                			tmp[idx][1] = meeting[q][1];
                        	tmp[idx++][0] = meeting[q++][0];
                		}else {
                			tmp[idx][1] = meeting[p][1];
                        	tmp[idx++][0] = meeting[p++][0];
                		}
                	}else {
                		tmp[idx][1] = meeting[q][1];
                    	tmp[idx++][0] = meeting[q++][0];
                	}
                } else { //q>end || (p<=mid && input[p]<input[q])
                	tmp[idx][1] = meeting[p][1];
                	tmp[idx++][0] = meeting[p++][0];
                }
            }

            for (int i=start;i<=end;i++) {
            	meeting[i][1]=tmp[i][1];
            	meeting[i][0]=tmp[i][0];
            }
        }
    }
	static int greedy(int[][] arr) {
		int result=0;
		
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
		meeting = new int[count][2];
		tmp = new int[count][2];
		for(int i =0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}
		mergeSort(0,count-1);
		int result = greedy(meeting);
		bw.write(result+"\n");
		bw.close();
	}
}
