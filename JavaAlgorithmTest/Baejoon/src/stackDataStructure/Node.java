package stackDataStructure;

public class Node {
	private Object data;
	private Node nextNode;
	
	//노드 처음 생성 시
	public Node(Object data) {
		this.data = data;
		this.nextNode = null;
	}
	
	//해당 노드를 원하는 노드(node top)와 연결해주는 메소드
	public void linkNode(Node top) {
		this.nextNode = top;
	}
	
	//해당 노드의 데이터를 가져오는 get메소드 
	public Object getData() {
		return this.data;
	}
	
	//해당 노드와 연결된 노드를 가져오는 get메소드
	public Node getNextNode() {
		return this.nextNode;
	}
}
