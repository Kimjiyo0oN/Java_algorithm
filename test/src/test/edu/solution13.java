package test.edu;


//체육복 통과 X 두줄 에러 
public class solution13 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        for(int i=0; i <lost.length; i++ ) {
        	for(int j=0; j <reserve.length; j++ ){
                if(lost[i] == reserve[j]) {
        			reserve[j] =-1;
        			lost[i] = -1;
        			answer++;
                    break;
        		}
            }
        }
        for(int i=0; i <lost.length; i++ ) {
        	for(int j=0; j <reserve.length; j++ ) {
        		if(lost[i]==-1) {
        			break;
        		}else if(reserve[j]==-1){
                    continue;
        		}
        		if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1) {
        			reserve[j] =-1;
        			answer++;
        			break;
            	}
        	}
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		solution13 sol = new solution13();
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {2,3};
		System.out.println(sol.solution(n, lost, reserve));
	}
}
