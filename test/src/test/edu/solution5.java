package test.edu;


//키패드 왼손잡이 오른손잡이를 입력하고 147은 왼손 ,369은 오른손 중간은 가까운 거리에 있는 손이
//같은 거리일때는 무슨 손잡이인지에 따라 무슨 손으로 키패드를 눌렀는 가를 출력
//*은 10 ,0은 11, # 은 12로 해서 거리를 구해줌
public class solution5 {
	public String solution(int[] numbers, String hand) {
		
		String answer = "";
		int leftnum = 10;
		int rightnum = 12;
		int leftdis = 0, rightdis =0;

		for(int nownum : numbers) {//int i=0; i <= numbers.length; i++
			if(nownum == 0) {
				nownum = 11;
			}
			leftdis = (Math.abs(leftnum-nownum))/3 + (Math.abs(leftnum-nownum))%3;
			rightdis=(Math.abs(rightnum-nownum))/3 + (Math.abs(rightnum-nownum))%3;
			//System.out.println(leftdis +"left"+leftnum);
			//System.out.println(rightdis+"right"+rightnum);
			switch(nownum) {
			case 1: case 4: case 7: 
				answer+= "L"; 
				leftnum = nownum;
				break; 
			case 3: case 6: case 9: 
				answer+= "R"; 
				rightnum = nownum;
				break;
			case 11: 
				if(hand.equals("left")) {
					if(leftdis ==rightdis) {
						answer+= "L"; 
						leftnum = nownum;
					}else if(leftdis < rightdis){
						answer+= "L"; 
						leftnum = nownum;
					}else if(leftdis > rightdis){
						answer+= "R"; 
						rightnum = nownum;
					}
				}else if(hand.equals("right")){
					if(leftdis ==rightdis) {
						answer+= "R"; 
						rightnum = nownum;
					}else if(leftdis < rightdis){
						answer+= "L"; 
						leftnum = nownum;
					}else if(leftdis > rightdis){
						answer+= "R"; 
						rightnum = nownum;
					}
				} break;
			case 2: case 5:case 8: 
				if(hand.equals("left")) {
					if(leftdis ==rightdis) {
						answer+= "L"; 
						leftnum = nownum;
					}else if(leftdis < rightdis){
						answer+= "L"; 
						leftnum = nownum;
					}else if(leftdis > rightdis){
						answer+= "R"; 
						rightnum = nownum;
					}
				}else if(hand.equals("right")){
					if(leftdis ==rightdis) {
						answer+= "R"; 
						rightnum = nownum;
					}else if(leftdis < rightdis){
						answer+= "L"; 
						leftnum = nownum;
					}else if(leftdis > rightdis){
						answer+= "R"; 
						rightnum = nownum;
					}
				} break;
				default: continue;
			}
		
		}
		
        
        return answer;
    }
	public static void main(String[] args) {
		solution5 sol = new solution5();
		int[] arr22 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println(sol.solution(arr22,"left"));
	}
}
