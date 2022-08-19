package test.edu.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호의값
public class parentheses {
	
	private Stack<Character> stack= new Stack<>();
	
	public int report(String input) {
		int answer = 0;
		int cnt = 1;
		
		for(int i =0; i < input.length(); i++) {
			if(input.charAt(i)=='(') {
				stack.push(input.charAt(i));
				cnt *=2;
			}else if(input.charAt(i)==')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					answer = 0;
					break;
				}else if(input.charAt(i-1)=='(') {
					answer+= cnt;	
				}
				stack.pop();
				cnt/=2;
			}else if(input.charAt(i)=='[') {
				stack.push(input.charAt(i));
				cnt *=3;
			}else if(input.charAt(i)==']') {
				if(stack.isEmpty() || stack.peek() != '[') {

					answer = 0;
					break;
				}else if(input.charAt(i-1)=='[') {
					answer+= cnt;	
				}
				stack.pop();
				cnt/=3;
			}
		}
		return answer; 
	}
	public static void main(String[] args) throws IOException {
		
		parentheses pa = new parentheses();
		
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		String input = SB.readLine();
		System.out.println(pa.report(input)); 
	}
}
