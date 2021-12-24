package pairOfDice;

public class PairOfDice {
	public int die1;
	public int die2;
	
	public PairOfDice(int val1, int val2) {
		die1 = val1;
		die2 = val2;
	}
	public void roll() {
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
	}

}
