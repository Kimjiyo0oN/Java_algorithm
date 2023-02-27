package codingTest;


public class Test1 {
	public static int solution(String[] bakery_schedule, String current_time, int k) {
        int answer = -2;
        
        String[][] temp = new String[bakery_schedule.length][3]; //스케줄 나눠서 넣은 배열
        String[] time = current_time.split(":"); // 현재시간 쪼개서 넣은 배열
        int i =0; 
        int indexResult =-1;
        for(String s : bakery_schedule) {
        	temp[i][0] = s.split(" ")[0];
        	temp[i][1] = temp[i][0].split(":")[1];
        	temp[i][0] = temp[i][0].split(":")[0];
        	temp[i][2] = s.split(" ")[1];
        	if(Integer.parseInt(temp[i][0]) >= Integer.parseInt(time[0]) && Integer.parseInt(temp[i][1]) >= Integer.parseInt(time[1])) {
        		if(indexResult == -1) {
        			indexResult = i; 
        		}
        	}
        	i++;
        }
        
        int j = 0;
        for(j = indexResult; j < i; j++) {
        	k -= Integer.parseInt(temp[j][2]);
        	if(k <=0) {
        		break;
        	}
        }
        
        if(k <=0) {
        	if(j==indexResult) {
        		answer = 0;
        	}else {
        		answer= (Integer.parseInt(temp[j][0]) - Integer.parseInt(time[0]))*60;
        		if(Integer.parseInt(temp[j][1]) >=  Integer.parseInt(time[1])) {
        			answer += Integer.parseInt(temp[j][1])-Integer.parseInt(time[1]);
        		}else {
        			answer -= Integer.parseInt(time[1])-Integer.parseInt(temp[j][1]);
        		}
        	}
        }else {
        	answer = -1;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		/*
		 * String[] ii = {"09:05 10","12:20 5","13:25 5","14:24 5"}; String[] iii = new
		 * String[3];
		 */
		int result = solution(new String[]{"09:05 10","12:20 5","13:25 5","14:24 5"},"12:05",10);
		System.out.println(result);
		
	}
}
