package test.edu;

import java.util.HashMap;
import java.util.Map;

//체육복 hashMap 이용하기 
//전체 학생의 수는 2명 이상 30명 이하입니다.
//육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다
//여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
//여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다
//고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
//2  0
//3  1 (re)
//4  -1 (los)
public class solution13Practice {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer =n-lost.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : lost) {
			map.put(i, -1);
			//System.out.println(map.get(i));
		}
		for(int i : reserve) {
			map.put(i, map.getOrDefault(i, 0)+1);
			if(map.get(i)==0) {
				answer++;
			}
			//System.out.println(map.get(i));
		}
		for(int lostKey : map.keySet()) {
			for(int reKey : map.keySet()) {
				if(map.get(lostKey) == -1&&map.get(reKey)==1) {
					if(lostKey-1 == reKey) {
						answer++;
						map.put(reKey,map.get(reKey)-1);
						break;
					}
					if(lostKey+1 == reKey) {
						answer++;
						map.put(reKey,map.get(reKey)-1);
						break;
					}
				}
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		solution13Practice sol = new solution13Practice();
		int n =7;
		int[] lost = {2,4,5};
		int[] reserve = {2,3};
		System.out.println(sol.solution(n,lost,reserve));
	}
}
