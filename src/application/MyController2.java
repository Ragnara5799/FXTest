package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class MyController2 implements Initializable {

	@FXML
	private Button myButton;
	
	@FXML
	private TextField myTextField;
	
	@FXML
	private Button changeScene;
	
	@FXML
	private Button moveToScene;
	
	@FXML
	private Pane rootPane;
	
	private boolean isButtonMoveToSceneHere = true;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MyApplication.app.setPane2(rootPane);
		
	}
	
	public void showDateTime(ActionEvent event) {
		System.out.println("Button clicked");
		
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
		String dateTimeString = df.format(now);
		
		myTextField.setText(dateTimeString);
	}
	
    public void changeScene(ActionEvent event) {
    	MyApplication.app.getStage().setScene(MyApplication.app.getScene1());
	}
    
    public void moveToScene(ActionEvent event) {
		System.out.println("Controller 2 was called!!");
    	if(moveToScene != null) {
    		if(isButtonMoveToSceneHere) {
		        MyApplication.app.getPane1().getChildren().add(moveToScene);
		        isButtonMoveToSceneHere = false;
    		} else {
    			MyApplication.app.getPane2().getChildren().add(moveToScene);
    			isButtonMoveToSceneHere = true;
    		}
    	}
	}
    	
    
}
