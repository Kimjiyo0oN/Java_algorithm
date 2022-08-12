package test.edu;

import java.util.Arrays;

public class solution6 {
	 public int solution(int[][] board, int[] moves) {
		 
	        int answer = 0;
	        int len = board[0].length;
	        int[][] clone = new int[len][len];
	        int[] report =new int[moves.length];
	        int repnum = 0;
	        int Xn =0;
	        int counter =0;
	        
	        for(int y = 0; y < len; y++ ) {
	        	for(int x = 0; x < len; x++ ) {
	        		clone[y][x]= board[x][y];
		        }
	        }
	        //System.out.println(Arrays.deepToString(clone));
	        //System.out.println( "moves: "+ Arrays.toString(moves));
	        for(int n :moves) {
	        	//System.out.println(n+ " : "+ len);
	        	for(int zero = 0; zero < len; zero++) {
	        		if(repnum >= 1) {
	        			Xn=report[counter-1];
	        			//System.out.println("Xn: "+ Xn);
	        		}
	        		if(clone[n-1][zero] != 0) {
	        			//System.out.println(report[repnum]+ " repnum : "+ clone[n-1][zero]);  				
	        			report[repnum]= clone[n-1][zero];
	        			clone[n-1][zero] = 0;
	        			if(Xn == report[repnum]) {
	        				answer += 2;
	        				counter -= 2;
	        				//System.out.println(" answer: "+ answer);
	        				
	        			}
	        			//System.out.println(repnum+ " repnum : "+ report[repnum]);
	        			repnum++;
	        			counter++;
	        			break;
	        		}			
	        	}	
	        }
	        return answer;
	 }
	 public static void main(String[] args) {
			solution6 sol = new solution6();
			int[][] board ={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
			int[] moves = {1,5,3,5,1,2,1,4};
			System.out.println(sol.solution(board,moves));
	}
	 
}
