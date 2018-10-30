package application;
	

import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class Main extends Application 
{
	
	FlowPane root;
		
		FlowPane root2;
		Scene scene;
		Scene scene2;
		boolean onScene1= true;
		
		private int zaehler = 0;
		GridPane root3;

	@Override
	public void start(Stage primaryStage) {
		try 
		{
			
			root = new FlowPane();
			root2 = new FlowPane();
			root3 = new GridPane();
			Button button1 = new Button("Hello1");
			Button button2 = new Button("Hello2");
			Button button3 = new Button("SwitchButton");
			Text text1 = new Text("Hallo");
			Button doSomthing = new Button("Do IT!");
			Button switchLable = new Button("Lable weg");
			

			
			button1.setOnMouseClicked(new EventHandler<MouseEvent>() 
			{

				@Override
				public void handle(MouseEvent event) 
				{
					primaryStage.setScene(scene2);
//					primaryStage.show();
				}
			});
			
			button2.setOnMouseClicked(new EventHandler<MouseEvent>() 
			{

				@Override
				public void handle(MouseEvent event) 
				{
					primaryStage.setScene(scene);
//					primaryStage.show();
				}
			});
			button3.setOnMouseClicked(new EventHandler<MouseEvent>() 
			{

				@Override
				public void handle(MouseEvent event) 
				{
					if(onScene1) 
					{
						root2.getChildren().add(button3);
						onScene1 = false;
					} 
					else 
					{
						root.getChildren().add(button3);
						onScene1 = true;
					}
				}
			});
			
			doSomthing.setOnMouseClicked(new EventHandler<MouseEvent>() 
			{
				public void handle(MouseEvent event) 
				{
					//Schlechteser Würfel generator xD
					Random a = new Random();
					zaehler = a.nextInt(6);
					zaehler++;
					text1.setText("Die " + zaehler);
				}
			});
			
			switchLable.setOnMouseClicked(new EventHandler<MouseEvent>() 
			{

				@Override
				public void handle(MouseEvent event) {
					if(onScene1) {
						root2.getChildren().add(text1);
						onScene1 = false;
					} else {
						root.getChildren().add(text1);
						onScene1 = true;
					}
				}
	
			});
			
			root.getChildren().add(button1);
			root2.getChildren().add(button2);
			root.getChildren().add(button3);
			root.getChildren().add(text1);
			root2.getChildren().add(doSomthing);
			root.getChildren().add(switchLable);
			
			
			scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene2 = new Scene(root2,800,800);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
