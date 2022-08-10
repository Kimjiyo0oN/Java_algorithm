package test.edu;

import java.util.*;

public class solution2Practice {
	  public int[] solution(String[] id_list, String[] report, int k) {
	        
		  int[] answer = new int[id_list.length];
	        
		  //Map<ep,value> key 중복이 불가능하고, Value는 중복이 가능 , value에 null 값도 가능 
		  Map<String,Integer> list = new HashMap<>();                   //id_list 와 그 배열 순서 저장
	      Map<String, HashSet<String>> report_list = new HashMap<>();   //id_list 에 따라 그 사람을 누가 신고 했는 지 저장 
	      //HashSet을 쓰는 이유는 같은 유저가 같은 사람을 여러 번 신고하면 한번으로 처리해야하기 떄문에  
	      
	      
	      for(int i = 0; i < id_list.length; i++) {                     //for문으로 
	    	  list.put(id_list[i], i);									//list에 muzi 0 | frodo 1 | apeach 2 | neo 3
	    	  report_list.put(id_list[i], new HashSet<>());             //report_list  muzi     new HashSet<>() - 중복이 되지 않는 값의 집합
	    	  															//			   frodo			
	      }									 							//             apeach
	        															//             neo

	      for (String r : report) {   
	    	  
	    	  String[] people = r.split(" ");                //{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"} 
	    	  												// " " 안에 띄워쓰기로 구분해서 나눠 자르겠다는 의미
	    	  report_list.get(people[1]).add(people[0]);    // report_list에 신고 받은 유저가 키 값이므로 get에 신고 받한 유저 값을 넣어서 
	    	  												// value값을 가져와서 add로 value을 추가
	      }
	        
	      for(int i = 0; i < id_list.length; i++) {
	    	  HashSet<String> count = report_list.get(id_list[i]);
	    	  if( count.size() >= k ) {
	    		  for (String s : count) {
	                    answer[list.get(s)]++;  // 해당 유저를 신고한 유저의 answer값++
	                }
	    	  }

	      }
	        
	        
	       return answer;
	        
	    }
	  public static void main(String[] args) {
		  
		  String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		  String[] report;
		  report = new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

		  solution2Practice sol2P = new solution2Practice();
		  int[] result = sol2P.solution(id_list, report, 2);
		  
		  for(int i =0; i< id_list.length; i++) {
	        	System.out.print(result[i] + " " );
	        }
		  
	  }
}

