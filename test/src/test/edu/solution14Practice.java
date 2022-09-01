package test.edu;

import java.util.Stack;

public class solution14Practice {
	public int solution(String dartResult) {
        int answer = 0;
        boolean flag = false;
        Stack<Integer> st = new Stack<>();
        for(int i =0; i < dartResult.length(); i++) {
        	char s = dartResult.charAt(i);
        	if(flag) {
        		flag = false;
        		continue;
        	}
        	if(s == '1'&& i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {  
        		s = 'F';
        		flag = true;
        	}
        	switch(s) {
        	case 'F':
        		st.push(10);
        		break;
        	case 'S': 
        		st.push((int) Math.pow(st.pop(), 1));
        		break;
        	case 'D': 
        		st.push((int) Math.pow(st.pop(), 2));
        		break;
        	case 'T': 
        		st.push((int) Math.pow(st.pop(), 3));
        		break;
        	case '*': 
        		if(st.size()==1) {
        			st.push(st.pop()*2);
        		}else {
        			int numUP = st.pop()*2;
        			int numDOWN = st.pop()*2;
        			st.push(numDOWN);
        			st.push(numUP);
        		}
        		break;
        	case '#': 
        		st.push((st.pop()*(-1)));
        		break;
        	default: 
        		int Int = Character.getNumericValue(s); 
        		st.push(Int);
        	}
        }
        
        while(!st.empty()){
        	answer += st.pop();
        }
        return answer;
    }
	public static void main(String[] args) {
		solution14Practice sol = new solution14Practice();
		String dartResult ="1D2S#10S";
		System.out.println(sol.solution(dartResult));
	}
}

