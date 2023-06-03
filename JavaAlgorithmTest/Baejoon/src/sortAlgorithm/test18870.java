package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test18870 {
	public static int[] result;
	public static void countSort(int[] arr) {
		int temp =0;
		int min =0;
		result = new int[arr.length];
		for(int i =0; i<arr.length;i++) { //배열 요소 중 가장 큰 값 찾기
			if(i == 0) {
				temp = arr[i];
				min = arr[i];
			}
			if(temp < arr[i]) {
					temp = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		int[] tempArr = new int[temp-min+1];  // 0~최댓값 크기의 배열을 만들어준다.
		int[] counting = new int[temp-min+1];  // 0~최댓값 크기의 배열을 만들어준다.
		for(int i =0; i<arr.length;i++) { 
		//arr 배열에 들어 있는 숫자 == tempArr 배열의 인덱스
		// tempArr[인덱스] =arr 배열에 들어 있는 숫자의 개수
			/*arr[i]-arr[0]
			 * for(int j =0; j<tempArr.length;j++) { if(arr[i] == j) { tempArr[j] += 1; } }
			 */
			tempArr[arr[i]-min] += 1;
			counting[arr[i]-min] += 1;
		}
		for(int i =0; i<tempArr.length;i++) {//누적합 형태로 변경
			if(i>0) {
				tempArr[i] += tempArr[i-1];
			}
		}
		
		for(int i = arr.length-1; i >=0; i--) {
		//arr 배열의 맨 뒤에 들어 있는 숫자부터 tempArr 배열의 인덱스에 들어 있는 값 찾아
		//tempArr[인덱스] -1 시킨 뒤 
		//정렬된 값을 담을 result 배열의 인덱스(tempArr[인덱스] -1 시킨 값)에
		//arr 배열의 해당 인덱스에 들어있는 값을 넣어준다
			tempArr[arr[i]-min]--;
			result[tempArr[arr[i]-min]] = arr[i];
		}
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(SB.readLine());
		int[] output = new int[count];
		StringTokenizer st = new StringTokenizer(SB.readLine()," ");
		for(int i =0; i<count;i++) {


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		countSort(output);
		for(int j : result) {
			SW.write(j+"\n");
		}
		SW.close();
		
	}
}