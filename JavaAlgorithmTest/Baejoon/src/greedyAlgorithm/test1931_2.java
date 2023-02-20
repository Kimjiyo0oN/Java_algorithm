package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class test1931_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		List<int[]> meeting = new ArrayList<>();
		for(int i =0; i<count; i++) {
			int[] iArr = new int[2];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			iArr[0] = Integer.parseInt(st.nextToken());
			iArr[1] = Integer.parseInt(st.nextToken());
			meeting.add(iArr);
		}
		int result = 0;
		int count2 =0;
		int min = 0;
		int max = 0; 
		boolean flag = false;
		for(int i =0; i<meeting.size(); i++) {
			List<Integer> re = new ArrayList<>();
			boolean flag1 = false;
			for(int j =0; j<meeting.size(); j++) {
				int[] temp = meeting.get(j); 
				if(i == 0) {
					if(j ==0) {
						min = temp[1];
						max = temp[1];;
					}else {
						if(min > temp[1] ) {
							min = temp[1];
						}
						if(max < temp[1]) {
							max = temp[1];
						}
					}
					flag = true;
				}else {
					if(result <= temp[0]) {
						if(!flag1) {
							min = temp[1];
							flag1 =true;
						}else {
							if(min > temp[1]) {
								min = temp[1];
							}
						}
						flag = true;
					}else {
						re.add(j);
					}
					if(min == max) {
						break;
					}
				}
			}
			if(!flag) {
				break;
			}
			result = min;
			count2++;
			meeting.remove(re);
			if( min == max) {
				break;
			}
			flag = false;
		}
		bw.write(count2+"\n");
		bw.close();
	}
}
