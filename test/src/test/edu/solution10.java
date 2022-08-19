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
        			if(result>10) {
        				if((result%2==0)&&(result%3==0)) {
            				answer--;
        				}
        			}else {
        				for(int n=2; n < result; n++) {
            				if(Math.sqrt(result)==n) {
            					answer--;
            					break;
            				}
            			}
        			}
        			
//        			if(sort>result&&result>=10) {
//        				for(i =2; i< sort; i++) {
//        					if(result%i) {
//                				answer +=1;
//                			}
//        				}
//        			}else {
//        				if((result%2!=0)&&(result%3!=0)) {
//            				answer +=1;
//        				}
//        			}
        			
        		}
        	}
        }

        return answer;
    }
	public static void main(String[] args) {
		  
		  solution10 sol = new solution10();
		  int[] nums = {1,2,3,4};
		  
		  System.out.println(sol.solution(nums));
	  }
}
