package test.edu;

public class solution7 {
	
	 public int solution(int[] numbers) {
	        int answer = -1;
	        int sum = 0;
	        int numberSum =0;
	        
	        for(int i =0; i <= 9; i++) {
	        	sum += i;
	        }
	        
	        for(int n : numbers) {
	        	
	        	numberSum += n;
	        }
	        answer = sum - numberSum; 
	       
	        return answer;
	 }
	 
	 public static void main(String[] args) {
			solution7 sol = new solution7();
			int[] numbers = {1,2,3,4,6,7,8,0};
			System.out.println(sol.solution(numbers));
	}
}
