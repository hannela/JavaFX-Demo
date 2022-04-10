package application;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class FXMLController implements Initializable {
    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    private Integer count = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myButton.setText("count");
        myLabel.setText(count.toString());
    }

    @FXML
    protected void handleCountButtonAction(ActionEvent e) {
        count++;
        myLabel.setText(count.toString());
    }

}
