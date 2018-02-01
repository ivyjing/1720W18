import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app which displays some Shapes.
 * 
 * @author mb
 *
 */
public class Exercise03 extends Application {
	private int SCENE_WIDTH = 800;
	private int SCENE_HEIGHT = 600;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		/*
		 * Task 01: Review the statements below. Reassure yourself that this is
		 * the same set-up as used in Exercise01.
		 */
		primaryStage.setTitle("title");
		Group root = new Group();
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

		/*
		 * Task 02: Display a circle and a rectangle in the window.
		 */

		/*
		 * Task 03: Mutate the position of the circle so that it is shown in the
		 * middle of the window.
		 */

		/*
		 * Task 04: Mutate the position of the rectangle so that it is shown in
		 * the middle of the window.
		 */

	}

}