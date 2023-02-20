package greedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaTest1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("몇단을 출력할까요?:");
		int count = Integer.parseInt(br.readLine());
		for(int i=1; i <= count; i++) {
			for(int j=1; j<= i; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	
}
