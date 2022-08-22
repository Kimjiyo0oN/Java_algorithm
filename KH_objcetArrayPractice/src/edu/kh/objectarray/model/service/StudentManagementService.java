package edu.kh.objectarray.model.service;

import edu.kh.objectarray.model.vo.Student;

public class StudentManagementService {
	
	private Student[] student = new Student[5];
	
	//기본 생성자
	public StudentManagementService() {
		student[0] = new Student("홍길동", 20, "A1", 100, 30, 70);
		student[1] = new Student("박철수", 25, "A1",50, 100, 80);
		student[2] = new Student("김미영", 27, "A1",100, 100, 30);
		student[3] = new Student("장원영", 21, "A1",50, 70, 100);
		//student[4] = new Student("김시은", 23, "A1",50, 80, 95);
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
}
