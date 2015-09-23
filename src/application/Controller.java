package application;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	public Controller(){
		
	}
    @FXML // fx:id="button"
    private Button button; // Value injected by FXMLLoader

    @FXML // fx:id="length"
    private TextField length; // Value injected by FXMLLoader

    @FXML // fx:id="width"
    private TextField width; // Value injected by FXMLLoader

    @FXML // fx:id="height"
    private TextField height; // Value injected by FXMLLoader

    @FXML // fx:id="result"
    private TextField result; // Value injected by FXMLLoader

    @FXML
    public void getInput(ActionEvent event) {
    	String l = length.getText();
    	String w = width.getText();
    	String h = height.getText();
    	buttonPress(l,w,h);

    }
    
    public void buttonPress(String l, String w, String h){
    	int length = Integer.parseInt(l);
    	int width = Integer.parseInt(w);
    	int height = Integer.parseInt(h);
    	
    	findVolume(length,width,height);
    }
    
    public void findVolume(int l, int w, int h){
    	int multiply = l*w*h;
    	
    	String volume = Integer.toString(multiply);
    	result.setText(volume);
    }

}


