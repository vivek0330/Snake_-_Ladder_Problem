package SnakeAndLadder;

public class SnakeAndLadderGame {

	// Variables and constant initialized
	public static int POSITION_OF_PLAYER = 0;
	public static int RANDOM_DIE_VALUE = (int) (Math.random() * 6) + 1;
	public static int RANDOM_CHECK = (int) (Math.random() * 10) % 3;

	public static void main(String[] args) {
		System.out.println("RandomValue: " + RANDOM_CHECK);
		switch (RANDOM_CHECK) {
		case 1:
			System.out.println("Ladder");
			System.out.println("Dice value: " + RANDOM_DIE_VALUE);
			POSITION_OF_PLAYER += RANDOM_DIE_VALUE;
			System.out.println("Player position is: " + POSITION_OF_PLAYER);
			break;
			
		case 2:
			System.out.println("Snake");
			System.out.println("Dice value: " + RANDOM_DIE_VALUE);
			POSITION_OF_PLAYER -= RANDOM_DIE_VALUE;
			System.out.println("Player position is: " + POSITION_OF_PLAYER);
			break;
			
		case 0:
			System.out.println("No Play");
			POSITION_OF_PLAYER = POSITION_OF_PLAYER;
			System.out.println("Player position is: " + POSITION_OF_PLAYER);
			break;

		default:
			System.out.println("Something Unexpectated Happen !!");

		}
	}

}
