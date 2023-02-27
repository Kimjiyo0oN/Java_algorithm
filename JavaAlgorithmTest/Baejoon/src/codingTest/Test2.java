package codingTest;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static int[] solution(int[] p, int[] b) {
        int[] answer = {};
        answer= new int[b.length];
        List<Integer> boss = new ArrayList<>();
        int count = 0;
        for(int i=0; i <p.length; i++) {
        	if(p[i] == -1) {
        		boss.add(i);
        		count++;
        	}
        }
        int notBoss = 0;
        for(int n : p) {
        	boolean notflag = false;
        	for(int bo: boss) {
        		if(n ==-1 || bo == n) {
        			notflag = true;
        		}
        	}
        	if(!notflag) ++notBoss;
        }
        int index = 0;
        boolean flag = false;
        for(int x : b) {
        	for(int y: boss) {
        		if(y == x) {
        			flag = true;
        			break;
        		}
        	}
        	if(flag) {
        		int count2= 1;
        		for(int i=0; i <p.length; i++) {
                	if(p[i] == x) {
                		answer[index] = count2++;
                	}
                }
        		answer[index] = count2++;
        		if(x ==2) {
        			answer[index]+=notBoss;
        		}
        	}else {
        		answer[index] = 0;
        	}
        	index++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] result = solution(new int[]{2,2,-1,1,5,-1,5},new int[]{2,5});
		for(int r : result) {
			System.out.print(r+",");
		}
		
		
	}
}
