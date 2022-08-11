package test.edu.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackTestPractice {
//	push X: 정수 X를 스택에 넣는 연산이다.
//	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	size: 스택에 들어있는 정수의 개수를 출력한다.
//	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	
	private Stack<Integer> stack= new Stack<>();
	
	// push 데이터 추가 	
	
	public void push(Integer a) {
		this.stack.push(a);
	}
	
	public Integer pop() {
		if(this.stack.empty()) {
			return -1;
		}else {
			int peak = this.stack.peek(); 
			this.stack.pop();
			return peak;
		}
	}
	
	
	public Integer top() {
		if(this.stack.empty()) {
			return -1;
		}else {
			return this.stack.peek();
		}
		 
	}
	
	public Integer size() {
		if(this.stack.empty()) {
			return 0;
		}else {
			return this.stack.size(); 
		}
		
	}
	
	public Integer empty() {
		if(this.stack.empty()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		StackTest st = new StackTest();
		
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("출력 해야하는 명령 수: ");
		int count =Integer.parseInt(SB.readLine());
		String input="";
		String input1="";
		//String[] PushInput;
		int[] output = new int[count];  //----------
		int outcount = 0;
		
		
		for(int i = 0; i < count; i++) {
			//System.out.print("명령어: ");
			input = SB.readLine();
			StringTokenizer SS = new StringTokenizer(input, " ");
            String command = SS.nextToken();
			if(input.length() >= 1) {
				input1 = input.substring(0,2);
			}
			
			switch(input1) {
			case "pu":
				
				//PushInput = input.split(" ");
				st.push(Integer.parseInt(SS.nextToken()));
				break;
			case "po": 
				output[outcount]=st.pop();
				outcount++;
				//System.out.println(st.pop()); ; 
				break;
			case "to": 
				output[outcount]=st.top();
				outcount++;
				//System.out.println(st.top()); 
				break; 
			case "si": 
				output[outcount]=st.size();
				outcount++;
				//System.out.println(st.size()); 
				break;
			case "em": 
				output[outcount]=st.empty();
				outcount++;
				//System.out.println(st.empty()); 
				break;
			default: i-=1;
				
			}
		}
		for(int j = 0; j < outcount; j++) {
			System.out.println(output[j]);
		}

	}
}
