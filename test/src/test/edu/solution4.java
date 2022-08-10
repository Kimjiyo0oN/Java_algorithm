package test.edu;

public class solution4 {
	public int solution(String s) {
        int answer = 0;
        
//        s = s.replace("zero", "0");
//        s = s.replace("one", "1");
//        s = s.replace("two", "2");
//        s = s.replace("three", "3");
//        s = s.replace("four", "4");
//        s = s.replace("five", "5");
//        s = s.replace("six", "6");
//        s = s.replace("seven", "7");
//        s = s.replace("eight", "8");
//        s = s.replace("nine", "9");
        
        String[] StringInt = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i =0; i < StringInt.length; i++) {
        	s = s.replaceAll(StringInt[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);
        return answer;
    }
	public static void main(String[] args) {
		
		
		
		
		String s;
		s = "one4seveneight";
		
		solution4 sol = new solution4();
		System.out.println(sol.solution(s));
		
	}
}
