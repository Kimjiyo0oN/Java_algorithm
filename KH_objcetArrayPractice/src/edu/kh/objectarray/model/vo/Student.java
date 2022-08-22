package edu.kh.objectarray.model.vo;

public class Student {
	private String  name;
	private int age;
	private String classRoom;
	
	private int java;
	private int dataBasic;
	private int html;
	
	public Student(){}
	public Student(String name,int age,String classRoom) {
		this.name = name;
		this.age = age;
		this.classRoom = classRoom;		
	}
	public Student(String name,int age,String classRoom, int java,int dataBasic,int html) {
		this(name, age, classRoom);
		
		this.java = java;
		this.dataBasic = dataBasic;
		this.html = html;	
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDataBasic() {
		return dataBasic;
	}
	public void setDataBasic(int dataBasic) {
		this.dataBasic = dataBasic;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	
}
