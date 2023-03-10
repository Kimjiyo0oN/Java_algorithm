package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1181 {
	static Map<Integer, Integer> map;
	public static String[] sort(String[] array) {
		
		String temp = "";
		int temp2;
		
		for(int i =0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(map.get(i) > map.get(j)) {
					temp2 = map.get(i);
					map.replace(i, map.get(j));
					map.replace(j, temp2);
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}else {
					if(map.get(i) == map.get(j)) {
						for(int x= 0; x < array[i].length(); x++) {
							int char1 = array[i].charAt(x) - '0';
							int char2 = array[j].charAt(x) - '0';
							if(char1 > char2) {
								temp2 = map.get(i);
								map.replace(i, map.get(j));
								map.replace(j, temp2);
								temp = array[i];
								array[i] = array[j];
								array[j] = temp;
								break;
							}else {
								if(char1 < char2) {
									break;
								}
							}
						}
					
					}
				}
			}
		}
		
		return array;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		String[] array = new String[count];
		map = new HashMap<>();
		for(int i =0; i < count; i++) {
			array[i] = br.readLine();
			map.put(i, array[i].length());
		}
		
		sort(array);

		List<Integer> l = new ArrayList<>();
		for(int i =0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i].length() == array[j].length()) {
					boolean flag = true;
					for(int x= 0; x < array[i].length(); x++) {
						int char1 = array[i].charAt(x) - '0';
						int char2 = array[j].charAt(x) - '0';
						if(char1 == char2) {
							continue;
						}else {
							flag = false;
							break;
						}
					}
					if(flag) {
						l.add(j);
					}
				}
			}
		}
		for(int i =0; i < count; i++) {
			if(l.contains(i)) {
				//bw.write(array[i]+"\n");
				continue;
			}else {
				bw.write(array[i]+"\n");
			}
		}
		bw.close();
	}
}
