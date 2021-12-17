
package main;


public class Main {
		public static void main(String[] args) {
			
			BST bst = new BST(new Node(100));
			
			bst.add(280);
			bst.add(98);
			bst.add(50);
			bst.add(78);
			bst.add(440);
			bst.add(333);
			bst.add(290);
			bst.add(145);
			bst.add(444);
			
			
			
			System.out.println(bst.find(440));
		}
}
