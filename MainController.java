package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
    private AnchorPane MainAnchor;
	@FXML
	public void switchToLog(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Log.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void switchToJournal(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Journal.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void switchToProgress(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Progress.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void switchToSettings(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
