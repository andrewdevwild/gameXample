import it.gameXample.boards.Greenland;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Greenland board = new Greenland(userInput, System.out);
        board.startGame();
    }
}