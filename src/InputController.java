import java.util.Scanner;

/**
 * Starts the main controller of the application which takes input from the
 * user in an infinite loop until the users quits the program.
 */
public class InputController {
    //#region private properties
    private Scanner scanner; //Java class that allows basic input form a command prompt.
    MagicEightBall ball; //Class that contains game behavior.
    private boolean playing; //Flag that controls exit point in while loop.
    String input; //String that holds the input from the scanner for processing.
    //#endregion


    //#region constructor
    /**
     * Instantiates the main properties of the input controller.
     */
    public InputController() {
        scanner = new Scanner(System.in);
        ball = new MagicEightBall();
        playing = true;
    }
    //#endregion


    //#region public method
    /**
     * Starts the InputController.
     */
    public void start() {        
        printTitle();
    
        while(playing) {
            scanInput();
            if(input.equals("Quit")) { //NOTE: input == "Quit" does not work.
                endGame();
            } else {
                printAnswer();
            }
        }
    }
    //#endregion


    //#region private methods
    private void printTitle() {
        System.out.println("********************");
        System.out.println("Eightball Game");
        System.out.println("********************");
        System.out.println();
    }

    private void scanInput() {
        System.out.println("Type a Question and hit Enter to get Answer. Type \"Quit\" and Enter to exit.");
        input = scanner.nextLine();
    }

    private void printAnswer() {
        System.out.println(input + "Recieving Answer");
        System.out.println("..." + ball.getRandomAnswer());
        System.out.println();
    }

    private void endGame() {
        System.out.println("Thanks for playing!");
        scanner.close();
        playing = false;
    }
    //#endregion
}
