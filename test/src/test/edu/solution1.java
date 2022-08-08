package test.edu;

import java.util.Scanner;

public class solution1 {
	
	public int[] solution(int[] lottos, int[] win_nums){
		int maxCorr =6;
		int minCorr =7;
		
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<win_nums.length; j++){
				if(lottos[i] == win_nums[j]) {
					maxCorr--;
					minCorr--;
				}else if(lottos[i] == 0){
					continue;
				}
			}
			if(lottos[i] == 0) {
				maxCorr--;
			}
			
		}
		if(minCorr ==7) {
			minCorr -= 1;
		}
		
		int[] answer = {maxCorr+1, minCorr};		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lottos = new int[6];		
		int[] win_nums = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++){
			
			System.out.print("lottos[i](0~45 사이 숫자 입력, 1의 제외하고 같은 숫자를 두번 이상 입력하지 않아야함) :" );
			lottos[i] = sc.nextInt();
		}
		
		System.out.println("--------------------------------------------------------");
		
		for (int i = 0; i < 6; i++){
			
			System.out.print("win_nums[i](1~45 사이 숫자 입력, 1의 제외하고 같은 숫자를 두번 이상 입력하지 않아야함) :" );
			win_nums[i] =sc.nextInt();
		}
		
		solution1 sol = new solution1();
		
		int[] answer = sol.solution(lottos, win_nums);
		
		System.out.println("[최고순위: " + answer[0] + ", 최저순위: " + answer[1] +"]");
		
	}

}
