import java.util.ArrayList;
import java.util.Random;


public abstract class AbstractBoard implements Board{
	
	protected int myHeight;
	protected int myWidth;
	protected ArrayList<Position> legalTransitions;
	protected Random randomGenerator;
	
	public AbstractBoard(int height, int width, ArrayList<Position> transitions){
		myHeight = height;
		myWidth = width;
		legalTransitions = transitions;
		randomGenerator = new Random();
	}
	
	public abstract Position getNextPosition(Ant ant);
	
}
