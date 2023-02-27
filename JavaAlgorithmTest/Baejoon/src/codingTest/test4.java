package codingTest;

import java.util.Arrays;

public class test4 {
	static int[] resultArray;
	static int resultCount =0;
	private static int permutation(int cnt, int n, int[] array, int m) {
		
		if (cnt == n) {
			//System.out.println(Arrays.toString(resultArray));
			int sum = 0;
			for(int z=0;z<resultArray.length; z++) {
	        	sum+= resultArray[z];
	        }
			if(sum ==m) {
				resultCount++;
			}
			return resultCount;
		}
		for (int j = 0; j < array.length; j++) {
			
			resultArray[cnt] = array[j];
			
			permutation(cnt+1, n, array,m);
		}
		return resultCount;
	}
	
	public static int solution(int n, int m, int k) {
        int answer = -1;
        int[] array = new int[k];
        resultArray = new int[n];
        for(int i =k; i>0; i--) {
        	
        	array[i-1] = i;
        }
         
        answer = permutation(0,n,array,m);
       
        return answer;
    }

	
	public static void main(String[] args) {
		int result = solution(10,6,5);
		System.out.print(result);
	}
}

