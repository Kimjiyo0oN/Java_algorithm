package edu.kh.objectarray.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.kh.objectarray.model.service.StudentManagementService;
import edu.kh.objectarray.model.vo.Student;

public class StudentManagementView {
	private BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	private StudentManagementService service = new StudentManagementService();
	
	/**
	 * 메뉴 출력용 메서드
	 * @throws IOException 
	 */
	public void display() throws IOException {
		int input =0;
		
		do {
			System.out.println("----- [학생 관리 프로그램] -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("6. 학생 점수 조회(이름 검색)");
			System.out.println("0. 종료");
			System.out.println("---------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = Integer.parseInt(buffer.readLine());
			
			System.out.println();
			
			switch(input) {
			case 1:addStudent();
			break;
			case 2:printAll();
			break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6:break;
			case 0:System.out.println("프로그램을 종료합니다."); break;
			default:System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
			
		}while(input !=0);
	}
	
	/**
	 * 추가할 학생 정보 입력용 메서드
	 * 	private String  name;
		private int age;
		private String classRoom;
	
		private int java;
		private int dataBasic;
		private int html;
	 * @throws IOException 
	 */
	public void addStudent() throws IOException {
		System.out.println("[학생 추가]");
		
		System.out.print("이름 : ");
		String name = buffer.readLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(buffer.readLine());
		
		System.out.print("반 : ");
		String classRoom = buffer.readLine();
		
		int result = service.addStudent(name, age, classRoom);
		
		if(result ==0) {
			System.out.println("정원 30명이 초과되어 더 이상 학생을 추가할 수 없습니다.");
		}else {
			System.out.println("학생 정보가 추가되었습니다.");
		}
		
	}
	public void printAll() throws IOException {
		System.out.println("[학생 전체 정보 조회]");
		// |  이름  |  나이  |  반  | java | dataBasic | html |  
		//--------------------------------------------
		// | 홍길동 |   20  |  A1  |  100 |     30    |  70  | 
		// | 홍길동 |   20  |  A1  |  100 |     30    |  70  |  
		// | 홍길동 |   20  |  A1  |  100 |     30    |  70  |  
		// | 홍길동 |   20  |  A1  |  100 |     30    |  70  | 
		// | 홍길동 |   20  |  A1  |  100 |     30    |  70  | 
		Student[] stdArr = service.getStdArr(); 
		System.out.println("|  이름  |  나이  |  반  | java | dataBasic | html |");
		
		for(int i =0; i <stdArr.length; i++) {
			if(stdArr[i] == null) { //Student 객체를 참조하지 않는 인덱스가 있을 경우 
				break; //반복문 종료	
			}
			System.out.printf("| %s |   %d  |  %s |   %d |     %d    |  %d  |\n",
					stdArr[i].getName(),stdArr[i].getAge(), stdArr[i].getClassRoom(),
					stdArr[i].getJava(),stdArr[i].getDataBasic(),stdArr[i].getHtml());
		}
	}
}
