package test.edu;

import java.util.Arrays;

//K번째수
public class solution12 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i =0; i < commands.length; i++) {
        	int count = commands[i][1] -commands[i][0]+1;
        	int[] array1 = new int[count];
        	System.arraycopy(array, commands[i][0]-1 , array1, 0, count);
        	Arrays.sort(array1);
        	count =(commands[i][2]-1);
        	answer[i] = array1[count];
        }
        return answer;
    }
	public static void main(String[] args) {
		solution12 sol = new solution12();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(sol.solution(array, commands)));
	}
}
