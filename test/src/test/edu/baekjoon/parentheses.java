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
		
		
		for(int i =0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if() {
				
			}
			
		}
		
		if(input.contains(")(")) {
			
		}else if(input.contains("][")) {
			
		}else if(input.contains("](")) {
			
		}else if(input.contains(")[")) {
			
		}
		return answer; 
	}
	public static void main(String[] args) throws IOException {
		
		parentheses pa = new parentheses();
		
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		String input = SB.readLine();
		pa.report(input);
	}
}
