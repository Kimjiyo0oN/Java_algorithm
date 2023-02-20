package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test11651_2 {
	static void swap(int[][] a, int idx1, int idx2) {//인덱스 0에 있는 가장 작은 값을 꺼내 배열 마지막 요소와 바꿈 
		//힙으로 만들고 요소 자리 변경을 반복 그렇게 정렬해 나가면 가장 작은 값부터 배열됨 
		int[] t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t; 
	}
	static void downHeap(int[][] a,int left, int right) { // 힙으로 만드는 메서드
		int temp[] = a[left];
		int child;
		int parent;
		
		for(parent =left; parent <(right +1)/2;parent= child) {
			int cl = parent*2+1;
			int cr = cl +1;
			child = (cr<=right &&( a[cr][0] > a[cl][0] || (a[cr][0]==a[cl][0] && a[cr][1] > a[cl][1]) ) )?cr:cl;
			if(temp[0] >= a[child][0]) {
				if(temp[0] == a[child][0]) {
					if(temp[1] >= a[child][1]) {
						break;
					}
				}else {
					break;
				}
			} 
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	static void heapSort(int[][] a, int n ) {
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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[][] array = new int[count][2];
		for(int i = 0; i< count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		heapSort(array,array.length);
		for(int[] x : array) {
			bw.write(x[0]+" "+x[1]+"\n");
		}
		bw.close();
	}
}
