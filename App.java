/**
 * Root class for the program. It has the main(String[] args) method to start the Java program.
 */
public class App {
    public static void main(String[] args) throws Exception {
        //Instantiate and start the input controller. It is the main controller
        //of the application.
        InputController inputController = new InputController();
        inputController.start();
    }
}
