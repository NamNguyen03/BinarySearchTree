
package main;

public class Node {
	private int value;
	private Node nodeLeft;
	private Node nodeRight;
	
	public Node() {
		value = 0;
		nodeLeft = null;
		nodeRight = null;
	}

	
	public Node(int value) {
		this.value = value;
		nodeLeft = new Node();
		nodeRight = new Node();
	}

	public int getValueInt() {
		return value;
	}
	
	public String getValue() {
		return value == 0 ? "" : value + "";
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNodeLeft() {
		return nodeLeft;
	}

	public void setNodeLeft(Node nodeLeft) {
		this.nodeLeft = nodeLeft;
	}

	public Node getNodeRight() {
		return nodeRight;
	}

	public void setNodeRight(Node nodeRight) {
		this.nodeRight = nodeRight;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", nodeLeft=" + nodeLeft + ", nodeRight=" + nodeRight + "]";
	}
}
