package test.edu;

import java.util.*;

public class solution3 {
	public String solution(String new_id) {
		
		String lastChar;
		
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[~!@#$%^&*()=+[{]}:?,<>/]", "");  //안에 포함된 특수문자들을 모두 제거
        while(answer.contains("..")) {                                //... -> .. -> . 될때까지 
        	answer = answer.replace("..",".");
        }
        if(answer.startsWith(".")) {                                  //시작 문자가 .면 제거
        	answer = answer.replaceFirst(".","");
        }
        if(answer.length() == 0) {                                    //answer의 길이가 0일때 
        	answer = "a";                                             //answer은 a
        }
        if(answer.length() > 15) {                                    //길이가 16이상이라면 
        	answer = answer.substring(0,15);                          //첫 15개의 문자를 제외한 나머지 삭제
        }
        if(answer.endsWith(".")) {                                    //마지막 문자가 .이면
        	answer = answer.substring(0, answer.length()-1); 
        	//answer = answer.replaceAll(".$", "");                     //문자열의 마지막($)이.라면 제거
        } 
        if(answer.length()<=2) {                                       //길이가 2이하면 
        	for(int i = answer.length(); i <3; i++) {                  //길이가 3이 될때까지 
        		answer = answer + answer.substring(answer.length()-1); //마지막 문자를 추가
        	}
        }
        return answer; 
    }
	
	
	public static void main(String[] args) {
		
		String new_id;
		new_id = "abcdefghi....jklm.n..p";
		
		solution3 sol = new solution3();
		//sol.solution(new_id);
		System.out.println(sol.solution(new_id));
		
	}
	
}
