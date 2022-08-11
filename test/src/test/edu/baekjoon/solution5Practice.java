package test.edu.baekjoon;

import test.edu.solution5;

public class solution5Practice {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		int leftnum = 10;
		int rightnum = 12;
		int leftdis = 0, rightdis =0;

		for(int nownum : numbers) {
			switch(nownum) {
			case 1: case 4: case 7:
			}	
		}
		return answer;
    }
	public static void main(String[] args) {
		solution5Practice sol = new solution5Practice();
		int[] arr22 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(sol.solution(arr22,"left"));
	}
	
}