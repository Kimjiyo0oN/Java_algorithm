package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test2751_3 {
	public static int[] input;
    public static int[] tmp;
	public static void mergeSort(int start, int end) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid); //재귀함수
            mergeSort(mid+1, end); //재귀함수

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q<=end && (p>mid || input[p]>=input[q])) {
                	tmp[idx++] = input[q++];
                } else { //q>end || (p<=mid && input[p]<input[q])
                	tmp[idx++] = input[p++];
                }
            }

            for (int i=start;i<=end;i++) {
            	input[i]=tmp[i];
            }
        }
    }
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		int count =Integer.parseInt(SB.readLine());
		input = new int[count];
		tmp = new int[count];
		for(int i = 0; i < count; i++) {
			input[i] = Integer.parseInt(SB.readLine());
		}
		mergeSort(0,count-1);
		for(int j : input) {
			SW.write(j+"\n");
		}
		SW.close();
	}
}
