package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Main extends Application {
	
	//Variable declaration
	private Stage primaryStage;
	private Group root = new Group();
	
	
	
	//Main method
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Some Title");
		
		//Show the screen
		this.primaryStage.show();
	}

	
	
	
	
}
