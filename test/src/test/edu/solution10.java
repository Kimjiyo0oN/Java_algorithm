package test.edu;

//import java.util.Arrays;

//소수 구하기
public class solution10 {
	public int solution(int[] nums) {
        int answer = 0;
        int result = 0;

        for(int i=0; i<nums.length; i++) {
        	for(int x=i+1; x<nums.length; x++) {
        		for(int y=x+1; y<nums.length; y++) {
        			answer++;
        			result = nums[i]+nums[x]+nums[y];
        				for(int n=2; n < result; n++) {
            				if(result%n==0) {
            					answer--;
            					break;
            				}
            			}
        			
        		}
        	}
        }

        return answer;
    }
	public static void main(String[] args) {
		  
		  solution10 sol = new solution10();
		  int[] nums = {1,2,7,6,4};
		  
		  System.out.println(sol.solution(nums));
	  }
}
