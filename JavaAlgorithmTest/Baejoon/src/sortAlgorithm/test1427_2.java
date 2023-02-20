package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//힙정렬
public class test1427_2 {
	static void swap(int[] a, int idx1, int idx2) {//인덱스 0에 있는 가장 작은 값을 꺼내 배열 마지막 요소와 바꿈 
		//힙으로 만들고 요소 자리 변경을 반복 그렇게 정렬해 나가면 가장 작은 값부터 배열됨 
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t; 
	}
	static void downHeap(int[] a,int left, int right) { // 힙으로 만드는 메서드
		int temp = a[left];
		int child;
		int parent;
		
		for(parent =left; parent <(right +1)/2;parent= child) {
			int cl = parent*2+1;
			int cr = cl +1;
			child = (cr<=right && a[cr]<a[cl])?cr:cl;
			if(temp <=a[child]) break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	static void heapsort(int[] a, int n ) {
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
		String input = br.readLine();
		String[] arrayS;
		arrayS = input.split("");
		int[] array = new int[arrayS.length];
		int j = 0;
		for(String s : arrayS) {
			array[j++] = Integer.parseInt(s);
		}
		heapsort(array,array.length);
		for(int i: array) {
			bw.write(i+"");
		}
		bw.close();
	}
}
