package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test2751_2 {
	public static void quickSort(int[]arr, int start, int end) {
		if(start>=end) {return;} //원소가 1개일 경우 종료
		int pivot = start; //피벗은 리스트의 첫번째 요소
		int left = start+1; // 피벗보다 1보다 큰 인덱스
		int right=end; // 리스트의 마지막 요소 
		while(left <= right) {
			while(left <= end && arr[left] <= arr[pivot]) { // left가 마지막 인덱스보다 클때까지 혹시 left번째 요소가 피벗보다 클때까지
				//즉 left가 마지막 인덱스보다 클때나 left번째 요소가 피벗보다 클때 실행하지 않는다
				left++;
			}
			while(right > start && arr[right] >= arr[pivot]) { 
				right--;
			}
			if (left <= right) // 큰 값이 작은 값보다 왼쪽에 있으면
	        {
				int temp = arr[left];
				arr[left]= arr[right];
				arr[right]=temp;
				
				left++;
				right--;
	        }
		}
		//if(left>right) {//데이터가 엇갈린다면
			int temp = arr[pivot];
			arr[pivot] = arr[right];
			arr[right] = temp;
		//}
		quickSort(arr, start, right-1); //분할이후 왼쪽에서 정렬수행
		quickSort(arr, right+1,end);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		int count =Integer.parseInt(SB.readLine());
		int[] input = new int[count];
		
		for(int i = 0; i < count; i++) {
			input[i] = Integer.parseInt(SB.readLine());
		}
		quickSort(input,0, count-1);
		for(int j : input) {
			SW.write(j+"\n");
		}
		SW.close();
	}
}
