package stackDataStructure;


public class stackImplement {
	public static void main(String[] args) {
		ListStack stackL = new ListStack();
		
		stackL.push(5);
		stackL.push(8);
		stackL.push("dsagdsg");
		stackL.push("dsagdsgdasfsd");
		
		while(!stackL.isEmpty()) {
			System.out.println(stackL.pop());
		}
	}
}
