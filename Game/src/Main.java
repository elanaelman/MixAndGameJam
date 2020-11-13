import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Class handling graphics.
 * Uses JavaFX.
 */
public class Main extends Application {
	// Called only when launched from terminal.
	// Don't modify.
	public static void main(String[] args) {
		launch(args);
	}
	
	// Entry point to JavaFX program.
	public void start(Stage stage) {
		// Set up the window.
		stage.setTitle("A Game!");
		VBox root = new VBox();
		stage.setScene(new Scene(root, 100, 100));	//Should probably make this dynamic.
		stage.setResizable(false);
		
		// Prepare the board:
		Board board = testBoard();
		
		//Create graphics elements here.
		Text t = new Text(board.toString());
		root.getChildren().add(t);
		
		stage.show();
	}
	
	// Simple test board.
	private Board testBoard() {
		List<Position> walls = new ArrayList<Position>();
		walls.add(new Position(0, 1));
		walls.add(new Position(1, 0));
		
		Board board = new Board(2, walls);
		return board;
	}
}
