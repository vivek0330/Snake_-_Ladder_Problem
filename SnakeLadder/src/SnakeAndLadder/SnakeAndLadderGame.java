package SnakeAndLadder;

public class SnakeAndLadderGame {

	// Variables and constant initialized
	static int POSITION_OF_PLAYER_1 = 0;
	static int POSITION_OF_PLAYER_2 = 0;
	static int START_POSITION = 0;
	static int END_POSITION = 100;

	public static void main(String[] args) {

		// Play the game till the end position
		while (POSITION_OF_PLAYER_1 != END_POSITION && POSITION_OF_PLAYER_2 != END_POSITION) {

			// Generate random value
			int RANDOM_DIE_VALUE_1 = (int) (Math.random() * 6) + 1;
			int RANDOM_DIE_VALUE_2 = (int) (Math.random() * 6) + 1;
			int RANDOM_CHECK = (int) (Math.random() * 10) % 3;

			// Check the condition
			switch (RANDOM_CHECK) {
			case 1:
				System.out.println("Ladder");
				System.out.println("Dice 1 value: " + RANDOM_DIE_VALUE_1);
				System.out.println("Dice 2 value: " + RANDOM_DIE_VALUE_2);
				POSITION_OF_PLAYER_1 += RANDOM_DIE_VALUE_1;
				POSITION_OF_PLAYER_2 += RANDOM_DIE_VALUE_2;
				System.out.println("Player 1 position is: " + POSITION_OF_PLAYER_1);
				System.out.println("Player 2 position is: " + POSITION_OF_PLAYER_2);

				// player 1 condition
				if (POSITION_OF_PLAYER_1 > END_POSITION) {
					POSITION_OF_PLAYER_1 -= RANDOM_DIE_VALUE_1;
				} else if (POSITION_OF_PLAYER_1 == END_POSITION) {
					System.out.println("Player 1 position is: " + POSITION_OF_PLAYER_1);
					System.out.println("Player 1 Won !!!");
					break;
				}
				System.out.println("player 1 Position: " + POSITION_OF_PLAYER_1);

				// player 2 condition
				if (POSITION_OF_PLAYER_2 > END_POSITION) {
					POSITION_OF_PLAYER_2 -= RANDOM_DIE_VALUE_2;
				} else if (POSITION_OF_PLAYER_2 == END_POSITION) {
					System.out.println("Player 2 position is: " + POSITION_OF_PLAYER_2);
					System.out.println("Player 2 Won !!!");
					break;
				}
				System.out.println("player 2 Position: " + POSITION_OF_PLAYER_2);
				System.out.println("");
				break;

			case 2:
				System.out.println("Snake");
				System.out.println("Dice 1 value: " + RANDOM_DIE_VALUE_1);
				System.out.println("Dice 2 value: " + RANDOM_DIE_VALUE_2);

				POSITION_OF_PLAYER_1 -= RANDOM_DIE_VALUE_1;
				POSITION_OF_PLAYER_2 -= RANDOM_DIE_VALUE_2;

				if (POSITION_OF_PLAYER_1 < START_POSITION) {
					POSITION_OF_PLAYER_1 = START_POSITION;
					System.out.println("player 1 Position: " + POSITION_OF_PLAYER_1);
				}
				System.out.println("player 1 Position: " + POSITION_OF_PLAYER_1);

				if (POSITION_OF_PLAYER_2 < START_POSITION) {
					POSITION_OF_PLAYER_2 = START_POSITION;
					System.out.println("player 2 Position: " + POSITION_OF_PLAYER_2);
				}
				System.out.println("player 2 Position: " + POSITION_OF_PLAYER_2);
				System.out.println("");
				break;

			case 0:
				System.out.println("No Play");
				POSITION_OF_PLAYER_1 = POSITION_OF_PLAYER_1;
				POSITION_OF_PLAYER_2 = POSITION_OF_PLAYER_2;
				System.out.println("Player 1 position is: " + POSITION_OF_PLAYER_1);
				System.out.println("Player 2 position is: " + POSITION_OF_PLAYER_2);
				System.out.println("");
				break;

			default:
				System.out.println("Something Unexpectated Happen !!");

			}
			// condition check for negative position of the player
			if (POSITION_OF_PLAYER_1 < START_POSITION) {
				POSITION_OF_PLAYER_1 = START_POSITION;
			}
			if (POSITION_OF_PLAYER_2 < START_POSITION) {
				POSITION_OF_PLAYER_2 = START_POSITION;
			}

		}

	}

}
