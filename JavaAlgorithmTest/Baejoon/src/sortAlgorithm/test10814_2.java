package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test10814_2 {
	static String[][] aux;
	static void bottomUpMergeSort(String[][] a) {
	    int N = a.length;
	    aux = new String[N][2];
	    for (int size = 1; size < N; size = size + size) {
	      // size: 서브 배열의 크기
	      for (int lo = 0; lo < N - size; lo += size + size) {
	        // lo: 서브 배열의 인덱스
	        merge(a, lo, lo + size - 1, Math.min(lo + size + size - 1, N - 1));
	      }
	    }
	  }
	static void merge(String[][] a, int lo, int mid, int hi) {
	    //  a[lo..hi]를 aux[lo..hi]에 복제
	    for (int k = lo; k <= hi; k++) {
	      aux[k] = a[k];
	    }

	    int i = lo;       // sub 배열 1 인덱스
	    int j = mid + 1;  // sub 배열 2 인덱스

	    // 다시 a[lo..hi]로 병합
	    for (int k = lo; k <= hi; k++) {
	      if (i > mid) {
	        // sub 배열 1 인덱스가 마지막까지 갔다면 sub 배열 2의 값을 선택해 넣는다
	        a[k] = aux[j++];
	      } else if (j > hi) {
	        // sub 배열 2 인덱스가 마지막까지 갔다면 sub 배열 1의 값을 선택해 넣는다
	        a[k] = aux[i++];
	      } else if (Integer.parseInt(aux[j][0]) < Integer.parseInt(aux[i][0])) {
	        // 두 sub 배열 헤드 중 작은 값을 선택해 넣는다
	        a[k] = aux[j++];
	      } else {
	        // 두 sub 배열 헤드 중 작은 값을 선택해 넣는다
	        a[k] = aux[i++];
	      }
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
		bottomUpMergeSort(array);
		for(String[] a : array) {
			/* bw.write(Arrays.toString(a)+"\n"); */
			bw.write(a[0]+" "+a[1]+"\n"); 
		}
		
		bw.close();
	}
}
