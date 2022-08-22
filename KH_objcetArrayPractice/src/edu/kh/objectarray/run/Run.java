package edu.kh.objectarray.run;

import java.io.IOException;

import edu.kh.objectarray.view.StudentManagementView;

public class Run {
	public static void main(String[] args) throws IOException {
//		StudentManagementView view = new StudentManagementView();
//		view.display();
		new StudentManagementView().display();
	}
}
