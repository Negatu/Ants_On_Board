import java.util.ArrayList;


public class TestSimulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int boardHeight = 8;
		int boardWidth = 8;
		
		ArrayList<Position> adjacentTransitions = createTransitions(new Position(0,1), new Position(0,-1), new Position(1,0), new Position(-1,0));
		//ArrayList<Position> diagonalTransitions = createTransitions(new Position(0,1), new Position(0,-1), new Position(1,0), new Position(-1,0), new Position(1,1), new Position(-1,-1), new Position(-1,1), new Position(1,-1));

		Board board = new ChessBoard(boardHeight, boardWidth, adjacentTransitions);
		Position startingPosition = new Position(0, 0);
		Ant ant1 = new Ant(startingPosition, board);
		Ant ant2 = new Ant(startingPosition, board);
		for (int i=0; i<10000; i++){
			ant1.move();
			ant2.move();
			if (antsAtSameSquare(ant1, ant2)){
				System.out.println("Ants at "+ant1.getCurrentPosition()+" at i="+i);
				ant1.setPosition(startingPosition);
				ant2.setPosition(startingPosition);
			}
		}
		
		
	}
	
	
	private static boolean antsAtSameSquare(Ant ant1, Ant ant2){
		Position ant1Pos = ant1.getCurrentPosition();
		Position ant2Pos = ant2.getCurrentPosition();
		if (ant1Pos.getRow()==ant2Pos.getRow() && ant1Pos.getCol()==ant2Pos.getCol()){
			return true;
		}
		return false;
	}
	
	private static ArrayList<Position> createTransitions(Position... args){
		ArrayList<Position> transitions = new ArrayList<Position>();
		for (Position p : args){
			transitions.add(p);
		}
		return transitions;
	}

}
