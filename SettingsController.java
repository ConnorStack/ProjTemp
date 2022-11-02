package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SettingsController {
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private Label settingsLbl;

    @FXML
    private AnchorPane settingsAnchor;

    @FXML
    private Button toMainBtn;

    @FXML
    public void switchToMain(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
}
