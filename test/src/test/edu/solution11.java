package test.edu;
//완주하지 못한 선수
public class solution11 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i=0; i<participant.length; i++) {
        	for(int y=0; y<completion.length; y++) {
        		if(participant[i].equals(completion[y])) {
        			completion[y] =null;
        			participant[i] =null;
        			break;
            	}
   
        	}
        	if(participant[i] !=null) {
        		answer =participant[i];
            }
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		  
		  solution11 sol = new solution11();
		  String[] participant = {"mislav", "stanko", "mislav", "ana"};
		  String[] completion = {"stanko", "ana", "mislav"};
		  
		  System.out.println(sol.solution(participant,completion));
	  }
}
