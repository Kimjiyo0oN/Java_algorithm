package stackDataStructure;

public class ListStack {
	private Node top;
	
	public ListStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return(top == null);
	}
	
	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.linkNode(top);
		top = newNode;
	}
	
	public Object peek() {
		return top.getData();
	}
	
	public Object pop() {
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		else {
			Object item = peek();
			top = top.getNextNode();
			return item;
		}
	}
}
