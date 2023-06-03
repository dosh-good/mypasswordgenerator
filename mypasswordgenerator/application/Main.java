package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		// initialization of object
		VBox box = new VBox(5);
		TextField text = new TextField();
		Button okBtn = new Button();
		Alert display = new Alert(AlertType.INFORMATION);
		
		// adjustments
		box.setPadding(new Insets(150, 100, 250, 100));
		box.getChildren().addAll(text, okBtn);
		box.setAlignment(Pos.CENTER);
		text.insertText(0, "Enter your desired password length.");
		text.setPromptText("Enter your desired password length.");
		text.setPrefSize(200, 25);
		
		okBtn.setText("Generate password");
		okBtn.setOnAction(arg0 -> {
			PasswordGenerator password = new PasswordGenerator(text.getText());
			display.setContentText(password.getter());
			display.show();
		});
		// put it all together
		Scene scene = new Scene(box, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Password Generator");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
