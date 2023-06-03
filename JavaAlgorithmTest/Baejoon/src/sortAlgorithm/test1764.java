package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class test1764 {
	public static void main(String[] args) throws IOException{
			BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
			int[] inputCount = new int[2];
			StringTokenizer st;
			st = new StringTokenizer(SB.readLine()," ");
			for(int i = 0; i < inputCount.length; i++) {
				inputCount[i]=Integer.parseInt(st.nextToken());
			}
			Set<String> output = new HashSet<>();
			Set<String> output2 = new HashSet<>();
			for(int i = 0; i < inputCount[0]+inputCount[1]; i++) {
				if(i < inputCount[0]) {
					output.add(SB.readLine());
				}else {
					String temp = SB.readLine();
					if(output.contains(temp)) {
						output2.add(temp);
					}
				}
			}
			
			String[] s = new String[output2.size()];
			int count = 0;
			for(String i:output2) {
				if(count > 0){
					///////////////////////////////////
					for(int j=0; j< count; j++) {
						if(i.length() > s[j].length()) {
							for(int x=0; x< s[j].length(); x++) {
								int char1 = i.charAt(x) - '0';
								int char2 = s[j].charAt(x) - '0';
								if(char1 > char2) {
									s[count] =i;
									break;
								}else {
									if(char1 < char2) {
										String temp =s[j];
										s[j] =i;
										s[count] =temp;
										i = temp;
										break;
									}else {
										if(x == s[j].length()-1) {
											if(char1 == char2) {
												s[count] =i;
			                                    break;
			                                }
			                            }
			                        }
									
								}
							}
						}else {
							for(int x=0; x< i.length(); x++) {
								int char1 = i.charAt(x) - '0';
								int char2 = s[j].charAt(x) - '0';
								if(char1 > char2) {
									s[count] =i;
									break;
								}else {
									if(char1 < char2) {
										String temp =s[j];
										s[j] =i;
										s[count] =temp;
										i = temp;
										break;
									}else {
										if(x == i.length()-1) {
											if(char1 == char2) {
												String temp =s[j];
			                                    s[j] =i;
			                                    s[count] =temp;
			                                    i = temp;
			                                    break;
			                                }
			                            }
			                        }
								}
							}
						}
					}
					///////////////////////////////////
				} else {
					s[count] =i;
				}
				count++;
			}
			
			
			SW.write(output2.size() +"\n");
			for(String i:s) {
				SW.write(i+"\n");
			}
			SW.close();
	}
}
