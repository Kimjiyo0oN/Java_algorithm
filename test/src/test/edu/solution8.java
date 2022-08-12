package test.edu;

public class solution8 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i]==true) {
        		answer  += absolutes[i];
            }else if(!signs[i]){    	
            	answer  -= absolutes[i];
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		
		solution8 sol = new solution8();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(sol.solution(absolutes, signs));
	}
}
