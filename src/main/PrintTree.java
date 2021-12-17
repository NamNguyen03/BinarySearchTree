
package main;

public class PrintTree {
	//hàm khởi tạo truyền vào cây cần in
		public PrintTree(Node node) {

			setSpace(16);
			System.out.print(node.getValue());
			System.out.println("");
			setSpace(16);
			System.out.print(" |");
			System.out.println("");
			setSpace(8);
			System.out.print("  ");
			setline(63);
			System.out.print(" ");
			setline(63);
			System.out.println("");
			setSpace(8);
			System.out.print(" |");
			setSpace(16);
			System.out.print(" |");
			System.out.println("");
			setSpace(8);
			printLeftRight(node, 8);
			System.out.println("");
			setSpace(8);
			System.out.print(" |");
			setSpace(16);
			System.out.print(" |");
			System.out.println("");
			setSpace(4);
			System.out.print("  ");
			setline(31);
			System.out.print(" ");
			setline(31);
			setSpace(8);
			System.out.print("  ");
			setline(31);
			System.out.print(" ");
			setline(31);
			System.out.println("");
			setSpace(4);
			System.out.print(" |");
			setSpace(8);
			System.out.print(" |");
			setSpace(8);
			System.out.print(" |");
			setSpace(8);
			System.out.print(" |");
			System.out.println("");
			setSpace(4);
			printLeftRight( node.getNodeLeft(), 4);
			setSpace(8);
			printLeftRight( node.getNodeRight(), 4);

			
			System.out.println("");
			setSpace(4);
			System.out.print(" |");
			for(int i =0 ; i<3 ; i++) {
				setSpace(8);
				System.out.print(" |");
			}
			System.out.println("");
			setSpace(2);
			System.out.print("  ");
			setline(15);
			System.out.print(" ");
			setline(15);
			for(int i=0; i<3 ; i++) {
				setSpace(4);
				System.out.print("  ");
				setline(15);
				System.out.print(" ");
				setline(15);
			}
			
			System.out.println("");
			setSpace(2);
			System.out.print(" |");
			for(int i =0 ; i<7 ; i++) {
				setSpace(4);
				System.out.print(" |");
			}
			System.out.println("");
			Node nodeNext = node.getNodeLeft();

			setSpace(2);
			printLeftRight(nodeNext ==null ? null : nodeNext.getNodeLeft(), 2);
			setSpace(4);
			printLeftRight(nodeNext ==null ? null : nodeNext.getNodeRight(), 2);

			setSpace(2);
			nodeNext = node.getNodeRight();

			setSpace(2);
			printLeftRight(nodeNext ==null ? null : nodeNext.getNodeLeft(), 2);
			setSpace(4);
			printLeftRight(nodeNext ==null ? null : nodeNext.getNodeRight(), 2);

			System.out.println("");
			setSpace(2);
			System.out.print(" |");
			for(int i =0 ; i<7 ; i++) {
				setSpace(4);
				System.out.print(" |");
			}
			System.out.println("");
			setSpace(1);
			System.out.print("  ");
			setline(7);
			System.out.print(" ");
			setline(7);
			for(int i=0; i<7 ; i++) {
				setSpace(2);
				System.out.print("  ");
				setline(7);
				System.out.print(" ");
				setline(7);
			}
			System.out.println("");
			setSpace(1);
			System.out.print(" |");
			for(int i =0 ; i<15 ; i++) {
				setSpace(2);
				System.out.print(" |");
			}
			
			System.out.println("");
			
			if( null!= node.getNodeLeft()) {
				nodeNext = node.getNodeLeft().getNodeLeft();

				setSpace(1);
				printLeftRight(nodeNext ==null ? null : nodeNext.getNodeLeft(), 1);
				setSpace(2);
				printLeftRight(nodeNext ==null ? null : nodeNext.getNodeRight(), 1);
				
				setSpace(1);
				nodeNext = node.getNodeLeft().getNodeRight();

				setSpace(1);
				printLeftRight(nodeNext ==null ? null : nodeNext.getNodeLeft(), 1);
				setSpace(2);
				printLeftRight(nodeNext ==null ? null : nodeNext.getNodeRight(), 1);
				
			}
			
			
			
			
			setSpace(1);
			if( null!= node.getNodeRight()) {
				nodeNext = node.getNodeRight().getNodeLeft();

				setSpace(1);
				printLeftRight(nodeNext ==null ? null : nodeNext.getNodeLeft(), 1);
				setSpace(2);

				
				printLeftRight(nodeNext ==null ? null : nodeNext.getNodeRight(), 1);
				
				nodeNext = node.getNodeRight().getNodeRight();

				setSpace(2);
				printLeftRight( nodeNext ==null ? null : nodeNext.getNodeLeft(), 1);
				setSpace(2);
				printLeftRight( nodeNext ==null ? null : nodeNext.getNodeRight(), 1);
				setSpace(1);
			}
		}


		//hàm in ra 2 node con
		private  void  printLeftRight(Node node, int space) {
			if(node ==null) {
				System.out.print("");
				setSpace(space*2);
				System.out.print("");
				return;
			}
			Node left = node.getNodeLeft();
			Node right = node.getNodeRight();

			Node nodeNext = left;

			System.out.print(nodeNext == null ? "" : nodeNext.getValue() );

			nodeNext = right;
			setSpace(space*2);
			System.out.print(nodeNext == null ? "" : nodeNext.getValue());
		}

		//hàm in ra khoảng trắng truyền tham số là số các khoảng trắng
		private void setSpace(int position) {
			for(int i = 0; i < position; i++) {
				System.out.print("\t");
			}
		}

		//hàm in ra đường ngang "----" tham số là số phần tử "-"
		private void setline(int length) {
			for(int i = 0; i < length; i++) {
				System.out.print("-");
			}
		} 	
}
