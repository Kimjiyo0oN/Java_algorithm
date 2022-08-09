package test.edu;

import java.util.*;


public class solution2 {
	public int[] solution(String[] id_list, String[] report, int k) {
       
		int[] answer = new int[id_list.length];
        Map<String, Integer> people = new HashMap<>();  // 유저와 그 순서를 저장
        Map<String, HashSet<String>> count = new HashMap<>();  // 신고 받은 유저와 신고한 유저를 저장
        
        for (int i = 0; i < id_list.length; i++) {
            people.put(id_list[i], i);
            count.put(id_list[i], new HashSet<>());
        }
        
        for (String r : report) {
            String[] s = r.split(" ");
            count.get(s[1]).add(s[0]);   // 신고받은 유저에 신고한 유저를 붙여줌 ex) frod - muzy, apeach,,,
        }
        
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> h = count.get(id_list[i]);
            if (h.size() >= k) {     // k회 이상 신고받은 유저라면
                for (String s : h) {
                    answer[people.get(s)]++;  // 해당 유저를 신고한 유저의 answer값++
                }
            }
        }
        return answer;
    }
	public static void main(String[] args) {
	
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		solution2 sol = new solution2();
		int[] result = sol.solution(id_list,report, 2);
		
        for(int i =0; i< id_list.length; i++) {
        	System.out.print(result[i] + " " );
        }
	}
}
