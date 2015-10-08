
public class Position {
	private int myRow;
	private int myCol;
	
	Position(int row, int col){
		myRow = row;
		myCol = col;
	}

	public int getRow(){
		return myRow;
	}
	
	public int getCol(){
		return myCol;
	}

	public String toString(){
		return "Row = " + myRow + ", Column = " + myCol;
	}
}
