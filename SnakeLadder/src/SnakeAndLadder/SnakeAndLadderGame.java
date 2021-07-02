package SnakeAndLadder;

public class SnakeAndLadderGame {

	// Single player Start position is 0;
	public static int POSITION_OF_PLAYER_1 = 0;
	
	//Player Rolls The Die and get a value between 1 to 6;
    public static void dieRoll()
    {
            int die_value=(int)(Math.random()*6)+1;
            System.out.println("DieValue: " + die_value);
    }

	public static void main(String[] args) {
		// Welcome initialize message
		System.out.println("Welcome to the Snake & Ladder Game");
		SnakeAndLadderGame obj1=new SnakeAndLadderGame();
        obj1.dieRoll();
	}
}
