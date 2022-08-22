package test.edu;

import java.util.HashMap;
import java.util.Map;

//getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드

//getOrDefault(Object key, V DefaultValue)
//매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.
//key : 값을 가져와야 하는 요소의 키입니다.
//defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.

public class solution11Practice {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hash = new HashMap<>();
        
        for (String arg : participant){
          hash.put(arg, hash.getOrDefault(arg, 0) + 1);
        }
        for (String arg : completion){
          hash.put(arg, hash.get(arg) - 1);
        }
        for (String key : hash.keySet()) {
          if (hash.get(key) != 0){
             answer = key;
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
