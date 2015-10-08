import java.util.ArrayList;


public class ChessBoard extends AbstractBoard implements Board{

	public ChessBoard(int height, int width, ArrayList<Position> transitions) {
		super(height, width, transitions);
	}

	public Position getNextPosition(Ant ant) {
		boolean assigned = false;
		Position transition = null;
		while (!assigned){
			int index = randomGenerator.nextInt(legalTransitions.size());
			transition = legalTransitions.get(index);
			if (checkBoundary(transition)){
				assigned = true;
			}
		}
		int newRow = ant.getCurrentPosition().getRow() + transition.getRow();
	    int newCol = ant.getCurrentPosition().getCol() + transition.getCol();
		Position newPos = new Position(newRow, newCol);
		return newPos;
	}
	
	private boolean checkBoundary(Position position){
		if ((position.getRow()>=0) && (position.getCol()>=0) && (position.getRow()<myHeight) && (position.getCol()<myWidth)){
			return true;
		}	
		return false;
	}

}
