package test.edu;


//내적 구하기
public class solution9 {
	  public int solution(int[] a, int[] b) {
	        int answer = 0;
	        for(int i =0; i < a.length; i++) {
	        	answer += a[i]*b[i];
	        	System.out.println(answer);
	        }
	        return answer;
	    }
	  public static void main(String[] args) {
		  
		  solution9 sol = new solution9();
		  int[] a = {1,2,3,4};
		  int[] b = {-3,-1,0,2};
		  
		  System.out.println(sol.solution(a, b));
	  }
}
