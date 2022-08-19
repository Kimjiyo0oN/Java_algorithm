package test.edu.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class parenthesesTest {
	static LinkedList<Integer> list;
	   
	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String line = br.readLine();
	      
	      Stack<Character> st = new Stack<>();
	      boolean flag = true;
	      int answer = 0;
	      int cnt = 1;
	      for(int i = 0; i < line.length(); i++) {
	         char cur = line.charAt(i);
	         if(cur == '(') {
	            st.push(cur);
	            cnt *= 2;
	         } else if(cur == '[') {
	            st.push(cur);
	            cnt *= 3;
	         } else {
	            if(cur == ')') {
	               //기존 stack에 저장된 값이 없었거나 (이 아닌경우
	               if(st.isEmpty() || st.peek() != '(') {
	                  flag = false;
	                  break;
	               }
	               //()이 만났을 경우 기존까지 계산하던 값들을 answer에 반환한다
	               if(line.charAt(i-1) == '(') {
	            	  System.out.println("cnt:"+cnt);
	                  answer += cnt;
	                  System.out.println("answer:"+answer);
	               }
	               st.pop(); // 기존의 (를 stack에서 제거한다.
	               cnt /= 2; // ?????????????????
	            } else if(cur == ']') {
	               if(st.isEmpty() || st.peek() != '[') {
	                  flag = false;
	                  break;
	               }
	               if(line.charAt(i-1) == '[') {
	            	   System.out.println("cnt:"+cnt);
		               answer += cnt;
		               System.out.println("answer:"+answer);
	               }
	               st.pop();
	               cnt /= 3; // ????????????
	            }
	         }
	         
	      }
	      // 괄호의 배열이 정상이 아닐 경우
	      if(!flag || !st.isEmpty()) 
	         System.out.println(0);
	      else
	         System.out.println(answer);
	   }
}
