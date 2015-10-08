
public class Ant {
	
	private Position myCurrPosition;
	private Position myPrevPosition;
	private Board myBoard;
	
	public Ant(Position initPosition, Board board){
		myCurrPosition = initPosition;
		myPrevPosition = initPosition;
		myBoard = board;
	}
	
	public void move(){
		Position newPosition = myBoard.getNextPosition(this);
		myPrevPosition = myCurrPosition;
		myCurrPosition = newPosition;
	}
	
	public Position getCurrentPosition(){
		return myCurrPosition;
	}
	
	public Position getPrevPosition(){
		return myPrevPosition;
	}
	
	public void setPosition(Position newPos){
		myPrevPosition = myCurrPosition;
		myCurrPosition = newPos;
	}

}
