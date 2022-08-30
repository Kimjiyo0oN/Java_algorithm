package edu.kh.opp.method.view;

import java.util.Scanner;

import edu.kh.opp.method.model.service.MethodExampleService;

public class MethodExampleView {
	
	private Scanner sc = new Scanner(System.in);
	
	private MethodExampleService service = new MethodExampleService();
	
	public void display() {
		int input = 0;
		
		do {
			System.out.println("-------------------");
			System.out.println("1. 매개변수 X, 리턴 값이 X");
			System.out.println("2. 매개변수 O, 리턴 값이 X");
			System.out.println("3. 매개변수 X, 리턴 값이 O");
			System.out.println("4. 매개변수 O, 리턴 값이 O");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); //입력 버퍼 개행문자 제거
			
			System.out.println();
			
			switch(input) {
			case 1: service.method1(); break;
			case 2: menu2(); break;
			case 3: System.out.println(service.method3()); break;
			case 4: menu4();break;
			case 0:System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}while(input != 0 );
	}
	public void menu2() {
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		
		service.method2(input1, input2, input3);
		
	}
	public void menu4() {
		System.out.println("정수 입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.println("연산자 입력 : ");
		String op = sc.next();
		
		System.out.println("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d %s %d = %.1f\n",input1, op, input2 ,service.method4(input1, input2, op));
	}
}
