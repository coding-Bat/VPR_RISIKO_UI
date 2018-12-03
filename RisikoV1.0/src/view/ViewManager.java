package view;


import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;
import model.GameButton;

/**
 * @author Naschk4tze
 *
 */
public class ViewManager {

	/*
	 * Default width and height:
	 * 	@param defaultMainWidth  : Integer
	 * 	@param defaultMainHeight : Integer
	 * 
	 * @param mainPane	 : AnchorPane
	 * @param mainScene  : Scene
	 * @param mainStage  : Stage
	 */
	private final int defaultMainWidth = 800;
	private final int defaultMainHeight = 600; 
	
	private AnchorPane mainPane;
	private Scene mainScene;
	private Stage mainStage;

	
	/*
	 * Constructor.
	 * 
	 * Setting up the mainStage.
	 * Create a test Button.
	 */
	public ViewManager() {
		// AnchorPane used to organize all UI contents.
		// Allows the edges of child nodes to be anchored to an offset from the anchor pane edges and place elements using coordinates.
		mainPane = new AnchorPane();
		mainScene = new Scene(mainPane,defaultMainWidth,defaultMainHeight);
		mainStage = new Stage();
		
		mainStage.setScene(mainScene);
		createButtons();
		createBackground();
	}
	
	/*
	 * @return mainStage : Stage
	 * To set the primaryStage in Main.java
	 */
	public Stage getMainStage() {
		return mainStage;
	}
	
	/*
	 * Creates Buttons and add them to the mainPane.
	 * Add code do generate buttons.
	 */
	private void createButtons() {
		
		//Example button.
		GameButton button = new GameButton("click me");
		mainPane.getChildren().add(button);
		
		button.setLayoutX(200);
		button.setLayoutY(200);
		
	}
	
	/**
	 * Creates a background object and adds it to the mainPane.
	 */
	private void createBackground() {
		Image backgroundImage = new Image("view/resources/yellow_panel.png",256,256,false,true);
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
		mainPane.setBackground(new Background(background));
	}
	
}