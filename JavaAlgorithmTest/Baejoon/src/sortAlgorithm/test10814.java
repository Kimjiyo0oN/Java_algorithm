package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test10814 {
	
	static void swap(String[][] a, int idx1, int idx2) {//인덱스 0에 있는 가장 작은 값을 꺼내 배열 마지막 요소와 바꿈 
		//힙으로 만들고 요소 자리 변경을 반복 그렇게 정렬해 나가면 가장 작은 값부터 배열됨 
		String[] t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t; 
	}
	static void downHeap(String[][] a,int left, int right) { // 힙으로 만드는 메서드
		String temp[] = a[left];
		int child;
		int parent;
		
		for(parent =left; parent <(right +1)/2;parent= child) {
			int cl = parent*2+1;
			int cr = cl +1;
			child = (cr <= right && (Integer.parseInt(a[cr][0]) > Integer.parseInt(a[cl][0]) /* || (a[cr][0]==a[cl][0]) */  ) )?cr:cl;
			if(Integer.parseInt(temp[0]) > Integer.parseInt(a[child][0])) {
				break;
			} 
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	static void heapSort(String[][] a, int n ) {
		for(int i =(n-1)/2;i>=0;i--) {//처음 힙으로 정렬
			downHeap(a,i,n-1);
			//마지막 배열 요소랑 그 부모 요소
			//그 부모요소부터 모든 부모요소들 
		}
		for(int i =n-1; i>0; i--) {//가장 작은 값이랑 마지막 배열 요소 변경하고 힙으로 정렬을 반복
			swap(a,0,i);
			downHeap(a,0,i-1);
		}
	}
	
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count =Integer.parseInt(br.readLine());
		String[][] array = new String[count][2];
		for(int i =0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			array[i][0] = st.nextToken();
			array[i][1] = st.nextToken();
		}
		
		heapSort(array,array.length);
		
		for(int j =0; j < array.length-1; j++) {
			if(Integer.parseInt(array[j][0]) == Integer.parseInt(array[j+1][0])) {
				String temp[] = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			} 
		}
		
		for(String[] a : array) {
			/* bw.write(Arrays.toString(a)+"\n"); */
			bw.write(a[0]+" "+a[1]+"\n"); 
		}
		
		bw.close();
	}
}
