package edu.kh.opp.method.model.service;

public class MethodExampleService {
	private int num;
	
	public MethodExampleService() {};
	
	public void method1() {
		System.out.println("method1() 실행");
		
		int a = 10;
		int b = 20;
		
		System.out.println("a + b = "+(a+b));
	}
	
	public void method2(int num1, int num2, int num3) {
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		System.out.println("num3 : "+ num3);
		
		int sum = num1 + num2 + num3; 
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(sum/3.0));
		
	}
	public String method3() {
		String str = "";
		str+= "안녕하세요\n";
		str+= "오늘 비가 안왔으면 좋겠어요 \n";
		str+= "우산을 안들고 왔거든여ㅎㅎ\n";
		
		return str;
		
	}
	public double method4(int num1, int num2, String op) {
		double result = 0.0;
		
		switch(op) {
		case "+": result = num1 + num2; break;
		case "-": result = num1 - num2; break;
		case "*": result = num1 * num2; break;
		case "/": result = num1 / (double)num2; break;
		case "%": result = num1 % num2; break;
		}
		
		return result;
	}
}
