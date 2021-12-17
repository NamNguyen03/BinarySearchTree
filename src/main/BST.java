package main;

public class BST {
	private Node root;

	public BST(Node root) {
		super();
		this.root = root;
	}

	public BST() {
		super();
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void add(int value) {
		addNode(value, root);
	}
	
	private Node addNode(int value, Node root) {
		
		if(root.getValueInt() == 0) {
			return new Node(value);
		}
		
		if(root.getValueInt() < value) {
			root.setNodeRight(addNode(value, root.getNodeRight()));
		}
		
		if(root.getValueInt() > value) {
			root.setNodeLeft(addNode(value, root.getNodeLeft()));
		}
		
		return root;
	}
	
	public void delete(int value) {
		deleteNode(value, root);
	}

	private Node deleteNode(int value, Node root) {
		
        if (root.getValueInt() == 0) {
        	return root; 
        }
		
		if(root.getValueInt() < value) {
			root.setNodeRight(deleteNode(value, root.getNodeRight()));
		}
		
		if(root.getValueInt() > value) {
			root.setNodeLeft(deleteNode(value, root.getNodeLeft()));
		}
		
		if(root.getValueInt() == value) {
			if(root.getNodeLeft().getValueInt() == 0) {
				return root.getNodeRight();
			}
			
			if(root.getNodeRight().getValueInt() == 0) {
				return root.getNodeLeft();
			}
			
			root.setValue(getMaxValue(root.getNodeRight()));
			
			root.setNodeRight(deleteNode(root.getValueInt(), root.getNodeRight()));
		}
		
		
		return root; 
	}
	
	private int getMaxValue(Node node) {
		int maxValue = node.getValueInt();
		
		while(node.getNodeRight().getValueInt() != 0) {
			node = node.getNodeRight(); 
			maxValue = node.getValueInt();
		}
		return maxValue;
	}
	
	public Node find(int value) {
		return findNode(value, root);
	}

	private Node findNode(int value, Node root) {
		
		if( root == null || root.getValueInt() == 0 ) {
			return new Node();
		}
		
		if(  value > root.getValueInt()) {
			return findNode(value, root.getNodeRight());
		}
		
		if(value < root.getValueInt()) {
			return findNode(value, root.getNodeLeft());
		}

	
		
		return root;
	}
	
}
