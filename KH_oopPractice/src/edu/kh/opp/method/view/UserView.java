package edu.kh.opp.method.view;

import java.util.Scanner;

import edu.kh.opp.method.model.service.UserService;
import edu.kh.opp.method.model.vo.User;

public class UserView {
	private Scanner sc = new Scanner(System.in);
	private UserService service = new UserService();
	
	private User user = null;
	
	private User loginUser = null;
	
	public void displayMenu() {
		int input =0; //메뉴 입력용 변수 
		do {
			System.out.println("-------------사용자 기능 메뉴-------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 회원 정보 출력");
			System.out.println("5. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); //입력 버퍼 개행문자 제거
			
			switch(input) {
			case 1: this.signUp(); break;
			case 2: this.login(); break;
			case 3: this.logout(); break;
			case 4: this.printUser(); break;
			case 5: updateUser(); break;
			case 0: System.out.println("프로그램을 종료합니다....");break;
			default : System.out.println("잘못 입력 하셨습니다");
			}
		}while( input != 0);
	}
	public void signUp() {
		System.out.println("[회원 가입]");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별() : ");
		char Gender = sc.next().charAt(0);
		
		user = service.signUp(id, pw, name, age, Gender);
		
		System.out.println("회원 가입 완료");
	}
	public void login() {
		System.out.println("[로그인]");
		
		if(loginUser != null) {
			System.out.println("이미 로그인 상태입니다. ");
		}else {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			int result = service.login(id, pw, user);
			
			if(result == -1) {
				System.out.println("회원 가입 후 시도해주세요");
			}else if(result == 0) {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("<로그인 성공>");
				loginUser = user; // user변수가 참조하는 객체의 주소를
								  // login에 대입(얕은 복사)
			}
		}
	}
	public void logout() {
		if(loginUser != null) {
			loginUser = null;
			System.out.println("로그아웃 되었습니다. ");
		}else {
			System.out.println("로그인 후 이용해주세요. ");
		}
	}
	public void printUser() {
		System.out.println("[회원 정보 출력]");
		if(loginUser != null) {
			//loginUser가 참조하는 객체에서 getter를 이용해 필드 값을 얻어와 출력
			System.out.println("아이디: "+loginUser.getUserId()); 
			System.out.println("이름: "+loginUser.getUserName()); 
			System.out.println("나이: "+loginUser.getUserAge()); 
			String gender = null;
			if(loginUser.getUserGender()=='M') {
				gender ="남성";
			}else {
				gender ="여성";
			}
			System.out.println("성별: "+gender); 
		}else {
			System.out.println("로그인 후 이용해주세요.");
		}
	}
	
	public void updateUser() {
		System.out.println("[회원 정보 수정]");
		
		if(loginUser !=null) {
			System.out.print("수정할 이름: ");
			String name =sc.next();
			
			System.out.print("수정할 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("수정할 성별(M/F) : ");
			char gender = sc.next().charAt(0);
			
			service.updateUser(name, age, gender,loginUser);
			
			System.out.println("<회원 정보가 수정되었습니다.>");
		}else {
			System.out.println("로그인 후 이용해주세요.");
		}
	}
}
