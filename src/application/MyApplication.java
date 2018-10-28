package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyApplication extends Application{
	
	public static MyApplication app;
	
	private Scene scene1;
	private Scene scene2;
	private Stage stage;
	private Pane pane1;
	private Pane pane2;


	public static void main(String[] args) {
	    launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			app = this;
			
		    Parent root = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		    Parent root2 = FXMLLoader.load(getClass().getResource("/application/MyScene2.fxml"));
		    scene2 = new Scene(root2);
		    scene1 = new Scene(root);
		    stage = primaryStage;
		    
		    primaryStage.setTitle("MyApplication");
		    primaryStage.setScene(scene1);
		    primaryStage.show();
		    
	    } catch(Exception e) {
	    	
	    }
	}

	public Scene getScene1() {
		return scene1;
	}

	public void setScene1(Scene scene1) {
		this.scene1 = scene1;
	}

	public Scene getScene2() {
		return scene2;
	}

	public void setScene2(Scene scene2) {
		this.scene2 = scene2;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Pane getPane1() {
		return pane1;
	}

	public void setPane1(Pane pane1) {
		this.pane1 = pane1;
	}

	public Pane getPane2() {
		return pane2;
	}

	public void setPane2(Pane pane2) {
		this.pane2 = pane2;
	}
	
	

}
