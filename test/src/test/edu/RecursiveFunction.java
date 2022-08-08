package test.edu;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RecursiveFunction {
	public static void main(String[] args) {
		String[] people = {"1","2","3","4","5","6"};
		result(people);
	}
	private static void result( String[] people ) {
	    int r = 3;                        //미리 3개을 뽑아서 경우의 수를 찾는 거니까 배열이 3인 크기
	    boolean[] isChecked = new boolean[people.length];
	    //System.out.println(isChecked);
	    //System.out.println(isChecked[0]);
	    String[] result = new String[r];
	    ArrayList<String[]> totalList = new ArrayList<String[]>();
	    
	    permutation(people, isChecked, result, r, 0, totalList); //endpoint = 3 / dept =0
	    
	    for (String[] strings : totalList) {
	        String temp = "";
	        for( String text : strings ) {
	            temp += " " + text;
	        }
	        System.out.println(temp);
	    }
	    System.out.println("총 경우의 수 : " + totalList.size());
	}

	private static void permutation( String[] people, boolean[] isChecked, String[] result, int endPoint, int dept, ArrayList<String[]> totalList ) {
		//dept 출발 포인트 
		//System.out.println("endPoint=" + endPoint + "dept=" +dept);
		//System.out.println(isChecked[0]);
	    if( endPoint == dept ) {
	        totalList.add(result.clone());
	        System.out.println("endPoint=" + endPoint + "dept=" +dept);
	        
	    } else {
	        for ( int i = 0; i < people.length; i++ ) {     //people 배열 크기는 6(0~5까지)
	            if( !isChecked[i] ) {
	            	System.out.println(i);
		        	System.out.println("dept : "+ dept );
	                isChecked[i] = true; // 사용된 배열 위치
	                result[dept] = people[i]; // 저장 
	                permutation(people, isChecked, result, endPoint, dept + 1, totalList);
	                System.out.println("끝날 시점의 i: "+i);
	                isChecked[i] = false; // 사용된 것 다시 제자리
	                result[dept] = ""; // 저장된 것 제자리
	            }
	        }
	    }
	}
}
