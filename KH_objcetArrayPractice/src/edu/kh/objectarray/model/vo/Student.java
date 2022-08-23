package edu.kh.objectarray.model.vo;

public class Student {
	private String  name;
	private int age;
	private String classRoom;
	
	private int java;
	private int dataBase;
	private int html;
	
	private double Avg;
	private String succ;
	
	public Student(){}
	public Student(String name,int age,String classRoom) {
		this.name = name;
		this.age = age;
		this.classRoom = classRoom;		
	}
	public Student(String name,int age,String classRoom, int java,int dataBase,int html, String succ) {
		
		this(name, age, classRoom);
		
		this.java = java;
		this.dataBase = dataBase;
		this.html = html;
		this.Avg = ((java+dataBase+html)/3.0);
		this.succ = succ;
		
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
	public int getDataBase() {
		return dataBase;
	}
	public void setDataBasic(int dataBase) {
		this.dataBase = dataBase;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public double getAvg() {
		return Avg;
	}
	public void setAvg(double avg) {
		Avg = avg;
	}
	public String getSucc() {
		return succ;
	}
	public void setSucc(String succ) {
		this.succ = succ;
	}
	
	
}
