package edu.kh.objectarray.model.service;

import edu.kh.objectarray.model.vo.Student;

public class StudentManagementService {
	
	private Student[] student = new Student[5];
	
	//기본 생성자
	public StudentManagementService() {
		student[0] = new Student("홍길동", 20, "A1", 100, 30, 70, null);
		student[1] = new Student("김미영", 25, "A1", 100, 50, 80, null);
		student[2] = new Student("장원영", 27, "A1", 80, 90, 60, null);
		student[3] = new Student("김철수", 21, "A1", 80, 95, 70, null);
		student[4] = new Student("김시은", 28, "A1", 85, 45, 95, null);
	}
	
	public int addStudent(String name, int age, String classRoom) {
		
		Student[] addstudent = new Student[student.length+1];
		System.arraycopy(student, 0, addstudent, 0, student.length);
		//배열 요소 중 아무것도 참조하지 않는 (null) 인덱스 찾기
		// 단, 인덱스 30가 참조 중인 경우 0 반환 (정원 30명)
				
				
		// null인 인덱스 O -> 해당 인덱스 객체 주소 대입 후 1반환
		// 인덱스 30 X     -> 0 반환
		int idx = -1; // null인 인덱스가 몇 번째인 지 저장하는 용도의 변수 
				
		for(int i=0 ; i < addstudent.length; i++) {
			if(addstudent[i]== null) {//새로운 학생이 추가될 수 있는 자리가 있는 경우
				idx = i;
				break;
			}
		}
		if(idx == 7) { //null인 인덱스가 없는 경우 
			return 0;//현재 메서드를 종료하고 호출한 곳으로 0을 가지고 돌아감.
		}
				
		// null인 인덱스에 학생 객체를 생성해서 주소를 대입 
		addstudent[idx] = new Student(name, age, classRoom);
		
		student = addstudent;
		
		return 1;
		
	}
	public Student[] getStdArr() {
		return student;
	}
	public String getStd(int idx) {
		if(idx>=0 && idx < student.length) {
			if(student[idx]!= null) {
				String str = "이름 : " + student[idx].getName();
				   str += "\n나이 : " + student[idx].getAge();
				   str += "\n반  : " + student[idx].getClassRoom();
				   str += "\nJava : " + student[idx].getJava()+"점";
				   str += "\nDataBase : " + student[idx].getDataBase()+"점";
					  str += "\nHtml : " + student[idx].getHtml()+"점";
					   
					  return str;
			}else {
				return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
			}
		}else {
			return "입력된 값이 인덱스 범위를 초과했습니다.";
		}
			
	}
	public Student[] selectName(String name) {
		Student[] resultArr = new Student[student.length];
		
		int resultIndex =0;
		
		for(int i =0; i < student.length; i++) {
			if(student[i]== null) {
				break;
			}
			if(student[i].getName().equals(name)) {
				resultArr[resultIndex]= student[i];
				resultIndex++;
			}
		}
		//검색이 아무도 되지 않은 경우 
		if(resultIndex == 0) {
				return null;
		}else {// 결과가 있음
				return resultArr; 
		}
	}
	
	public int updateStudent(int idx, int java,int database, int html ) {
		if(idx<0 || idx >= student.length) {
			return -1;
		}else {
			if(student[idx] == null) {
				return 0;
			}else {
				student[idx].setJava(java);
				student[idx].setDataBasic(database);
				student[idx].setHtml(html);
				return 1;
			}
		}
				
	}
	
	public Student[] ScoreStudent(String name) {
		Student[] resultArr = new Student[student.length];
		
		int resultIdx = 0;
		for(int i=0; i<student.length; i++) {
			if(student[i] == null) {
				break; //반복 종료 
			}
			
			if(student[i].getName().equals(name)){
				resultArr[resultIdx] = student[i];
				
				resultIdx++;// 대입되는 인덱스를 다음으로 이동
			
			}
			
		}
		
		//검색이 아무도 되지 않은 경우 
		if(resultIdx == 0) {
			return null;
		}else {// 결과가 있음
			return resultArr; 
		}
		
	}
	
	
}
