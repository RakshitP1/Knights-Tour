package codes;

public class Node {
	
		private int data;
		
		private Node right;
		private Node left;
		private Node up;
		private Node down;
		
		private Node KnightPosition1;
		private Node KnightPosition2;
		private Node KnightPosition3;
		private Node KnightPosition4;
		private Node KnightPosition5;
		private Node KnightPosition6;
		private Node KnightPosition7;
		private Node KnightPosition8;
		
		//set all paths of the knight
		public void KnightsTourPaths(Node currentKnight)
		{
			setKnightPosition1(currentKnight);
			setKnightPosition2(currentKnight);
			setKnightPosition3(currentKnight);
			setKnightPosition4(currentKnight);
			setKnightPosition5(currentKnight);
			setKnightPosition6(currentKnight);
			setKnightPosition7(currentKnight);
			setKnightPosition8(currentKnight);
		}

		
		//getter and setter for all paths of the knight
		//setters check to see if the any of the positions are null
		//if non of the paths are null then the setter will set path		
		
		public Node getKnightPosition1() {
			return KnightPosition1;
		}
		public void setKnightPosition1(Node currentKnight) {
			
			KnightPosition1 = currentKnight;
			
			if(KnightPosition1.getUp() != null)
			{
				if(KnightPosition1.getUp().getUp() != null)
				{
					if(KnightPosition1.getUp().getUp().getLeft() != null)
					{
						KnightPosition1 = currentKnight.getUp().getUp().getLeft();
					}
				}
			}
		}


		public Node getKnightPosition2() {
			return KnightPosition2;
		}
		public void setKnightPosition2(Node currentKnight) {
			KnightPosition2 = currentKnight;
			
			if(KnightPosition2.getUp() != null)
			{
				if(KnightPosition2.getUp().getUp() != null)
				{
					if(KnightPosition2.getUp().getUp().getRight() != null)
					{
						KnightPosition2 = currentKnight.getUp().getUp().getRight();
					}
				}
			}
			
		}
		




		public Node getKnightPosition3() {
			return KnightPosition3;
		}
		public void setKnightPosition3(Node currentKnight) {
			KnightPosition3 = currentKnight;
			
			if(KnightPosition3.getRight() != null)
			{
				if(KnightPosition3.getRight().getRight() != null)
				{
					if(KnightPosition3.getRight().getRight().getUp() != null)
					{
						KnightPosition3 = currentKnight.getRight().getRight().getUp();
					}
				}
			}
			
		}



		public Node getKnightPosition4() {
			return KnightPosition4;
		}
		public void setKnightPosition4(Node currentKnight) {
			KnightPosition4 = currentKnight;
			
			if(KnightPosition4.getRight() != null)
			{
				if(KnightPosition4.getRight().getRight() != null)
				{
					if(KnightPosition4.getRight().getRight().getDown() != null)
					{
						KnightPosition4 = currentKnight.getRight().getRight().getDown();
					}
				}
			}
			
		}


		public Node getKnightPosition5() {
			return KnightPosition5;
		}
		public void setKnightPosition5(Node currentKnight) {
			KnightPosition5 = currentKnight;
			
			if(KnightPosition5.getDown() != null)
			{
				if(KnightPosition5.getDown().getDown() != null)
				{
					if(KnightPosition5.getDown().getDown().getRight() != null)
					{
						KnightPosition5 = currentKnight.getDown().getDown().getRight();
					}
				}
			}
			
		}



		public Node getKnightPosition6() {
			return KnightPosition6;
		}
		public void setKnightPosition6(Node currentKnight) {
			KnightPosition6 = currentKnight;
			
			if(KnightPosition6.getDown() != null)
			{
				if(KnightPosition6.getDown().getDown() != null)
				{
					if(KnightPosition6.getDown().getDown().getLeft() != null)
					{
						KnightPosition6 = currentKnight.getDown().getDown().getLeft();
					}
				}
			}
		}


		public Node getKnightPosition7() {
			return KnightPosition7;
		}
		public void setKnightPosition7(Node currentKnight) {
			KnightPosition7 = currentKnight;
			
			if(KnightPosition7.getLeft() != null)
			{
				if(KnightPosition7.getLeft().getLeft() != null)
				{
					if(KnightPosition7.getLeft().getLeft().getDown() != null)
					{
						KnightPosition7 = currentKnight.getLeft().getLeft().getDown();
					}
				}
			}
			
		}


		public Node getKnightPosition8() {
			return KnightPosition8;
		}
		public void setKnightPosition8(Node currentKnight) {
			KnightPosition8 = currentKnight;
			
			if(KnightPosition8.getLeft() != null)
			{
				if(KnightPosition8.getLeft().getLeft() != null)
				{
					if(KnightPosition8.getLeft().getLeft().getUp() != null)
					{
						KnightPosition8 = currentKnight.getLeft().getLeft().getUp();
					}
				}
			}
			
		}
		
		
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getUp() {
			return up;
		}
		public void setUp(Node up) {
			this.up = up;
		}
		public Node getDown() {
			return down;
		}
		public void setDown(Node down) {
			this.down = down;
		}
		

		public Node(int data) {
			this.data = data;
		}
		public Node() {
			this.data = 0;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
		
		
}


