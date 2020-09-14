package codes;

public class LinkedGrid {

	private Node first;

	private int dimension;

	public LinkedGrid(int dimension) {

		//int randomData = (int)((Math.random()*5) + 1);
		
		
		this.dimension = dimension;

		int count = 0;

		//Making the first node
		Node temp = new Node(count);

		first = temp;

		Node columnMarker = first;

		Node rowMarker = first;
		
		//Making the rest of the row
		for(int x = 0; x < dimension-1; x++)
		{
			//set references
			temp = new Node(count);
			temp.setLeft(columnMarker);
			columnMarker.setRight(temp);
			columnMarker = temp;
		}

		for(int y = 0; y < dimension-1; y++)
		{
			//randomData = (int)((Math.random()*5) + 1);
			
			temp = new Node(count);
			columnMarker = temp;
			temp.setUp(rowMarker);
			rowMarker.setDown(temp);

			for(int x = 0; x<dimension-1; x++)
			{
				//set the references
				temp = new Node(count);
				temp.setLeft(columnMarker);
				columnMarker.setRight(temp);
		        columnMarker.getUp().getRight().setDown(temp);
				temp.setUp(columnMarker.getUp().getRight());
				columnMarker = temp;
			}
			rowMarker = rowMarker.getDown();
		}
	}
	
	
	
	
	//solution counter
	int solutions = 0;
	
	public void moveKnight(int counter, Node currentKnight)
	{
		//set the data of the current position as the value counter
		currentKnight.setData(counter);
		
		
	   
	   //keep going through the if statement as long as the counter hasn't reached dimension*dimension
	  if(counter <= (dimension*dimension))
	  {
		currentKnight.KnightsTourPaths(currentKnight);
		
		//if the counter is equal to the product of the dimension then print the grid 
		 if(counter == (dimension*dimension))
		{
		 display();
	     System.out.println();
	     //increase solutions
	     solutions++;
	     
         System.out.println("Solution Number: " + solutions);
		}
		 
		 //if there is no solution 
		/* else
		 {
			 System.out.println("No Solution for a " + dimension + "x" + dimension + " grid");
			 return;
		 }*/
		 //increase counter
		 counter++;
		
		//Recursively go through each move 
		//if the data at the position is 0 and not null and go through recursion
		if(currentKnight.getKnightPosition1().getData() == 0 && currentKnight.getKnightPosition1() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition1());
			//display();
		}
		if(currentKnight.getKnightPosition2().getData() == 0 && currentKnight.getKnightPosition2() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition2());
		    //display();
		}
		if(currentKnight.getKnightPosition3().getData() == 0 && currentKnight.getKnightPosition3() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition3());
		}
		if(currentKnight.getKnightPosition4().getData() == 0 && currentKnight.getKnightPosition4() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition4());
		}
		if(currentKnight.getKnightPosition5().getData() == 0 && currentKnight.getKnightPosition5() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition5());
		}
		if(currentKnight.getKnightPosition6().getData() == 0 && currentKnight.getKnightPosition6() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition6());
		}
		if(currentKnight.getKnightPosition7().getData() == 0 && currentKnight.getKnightPosition7() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition7());
		}
		if(currentKnight.getKnightPosition8().getData() == 0 && currentKnight.getKnightPosition8() != null)
		{
			moveKnight(counter, currentKnight.getKnightPosition8());
		}
		
		//move back 1 step and set data to 0
		currentKnight.setData(0);
	    
		//decrease counter if the knight moves 1 step back
		counter--;
		
	  }
	  
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void display()
	{
		Node temp = first;

		Node rowMarker = first;

		while(temp!=null)
		{
			while(temp!=null)

			{
				if(temp.getData() < 10)
				{
					System.out.print(temp.getData() + "\t");
				}

				else if (temp.getData() < 100)
				{
					System.out.print(temp.getData() + "\t");
				}

				else
				{
	     			System.out.print(temp.getData() + "\t");
				}
				
				temp = temp.getRight();
			}
			System.out.println();
			rowMarker = rowMarker.getDown();
			temp = rowMarker;
			}
     }

	public Node getFirst() {
    	return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

     
	
	 














}
