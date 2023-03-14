package sortAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;


public class test00000 {

	   /* 안정 정렬 방법을 쓰면 될 듯??? 
	    *  안정 정렬 = 삽입, 병합, 버블
	    *  불안정 정렬 = 퀵, 선택
	    * */
	   
	   public static void insertSort(String[][] arr) {
	      
	      for(int i = 1 ; i < arr.length ; i++) {
	         String[] temp = arr[i];
	         int now = Integer.parseInt(arr[i][0]);
	         int index = i-1;
	         System.out.println("1:"+index); 
	         // index가 0이상이어야하는데 그건 안 써도 돼?
	         
	         System.out.println("index:"+index + ","+Integer.parseInt(arr[index][0])); 
	         System.out.println("index:"+index+','+Integer.parseInt(temp[0])); 
	         //▲ &&의 앞과 뒤를 바꾸니 해결! 컴퓨터는 멍충했다!
	         //while(Integer.parseInt(arr[index][0]) > now && index >= 0) {
	         while((index >= 0) && (Integer.parseInt(arr[index][0]) > Integer.parseInt(temp[0]) )) {
	        	 System.out.println("이거 변경된다고:"+index+','+Integer.parseInt(temp[0])+"??"+temp[0]); 
	            // 물어보기!!!!! 왜 이거랑
	            //------------------------------
				
				 System.out.println("22:"+index); arr[index+1][0] = arr[index][0];
				 System.out.println("222:"+index); arr[index+1][1] = arr[index][1];
				 
	            //------------------------------
	            // 이거랑 다르게 나와???????????????????????????????????????????????????????????????????
				
				//arr[index+1] = arr[index]; System.out.println("2:"+index);
				 
	            index--;
	            System.out.println("22222:"+index);
	            System.out.println("index2:"+index + ","+Integer.parseInt(arr[index][0])); 
		        System.out.println("index2:"+index+','+Integer.parseInt(temp[0])+"??"+temp[0]); 
	         }
	         // while문을 나온 후에, 값 집어넣기
	         System.out.println("temp:"+temp);
	         System.out.println("3:"+index);
	         arr[index+1] = temp;
	         System.out.println("arr[index+1]:"+ arr[index+1]);
	      }
	      
	   }
	   
	   public static void main(String[] args) throws IOException {

	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //길이 입력받기
	      int length = Integer.parseInt(br.readLine());
	      
	      String[][] arr = new String[length][2];
	      
	      for(int i = 0; i < length ; i++) {
	         
	         //이러면 바로 0과 1로 나눠지나?
	         arr[i] = br.readLine().split(" ");
	         

	      }
	      
	      
	      System.out.println("배열에 정상적으로 들어갔는지 확인중");
	      for(int i = 0; i < length ; i++) {
	         
	         System.out.println(arr[i][0]+" "+arr[i][1]);
	      }
	      System.out.println("배열에 정상적으로 들어갔는지 확인중");

	      
	      //삽입으로 풀어보자!
	      insertSort(arr);
	      
	      for(int i = 0; i < length ; i++) {
	         bw.write(arr[i][0]+" "+arr[i][1]+"\n");
	      }
	      bw.close();
	   }

	}