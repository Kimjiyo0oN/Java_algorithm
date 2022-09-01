package test.edu;

import java.util.Stack;

public class solution14 {
	public int solution(String dartResult) {
        int answer = 0;
        boolean flag = false;
        Stack<Integer> st = new Stack<>();
        for(int i =0; i < dartResult.length(); i++) {
        	char s = dartResult.charAt(i);
        	if(s == '1') {  
        		flag = true;
        		continue;
        	}
        	if(flag == true) {
        		if(s == '0') {
        			flag = false;
        			s = 'F';
        		}
        	}
        	switch(s) {
        	case 'F':
        		st.push(10);
        		break;
        	case 'S': 
        		if(flag) {
        			st.push(1);
        			flag = false;
        			break;
        		}
        		st.push((int) Math.pow(st.pop(), 1));
        		break;
        	case 'D': 
        		if(flag) {
        			st.push(1);
        			flag = false;
        			break;
        		}
        		st.push((int) Math.pow(st.pop(), 2));
        		break;
        	case 'T': 
        		if(flag) {
        			st.push(1);
        			flag = false;
        			break;
        		}
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
		solution14 sol = new solution14();
		String dartResult ="1D#2S*3S";
		System.out.println(sol.solution(dartResult));
	}
}
