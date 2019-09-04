package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private TextField user;
    @FXML private PasswordField pass;


    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        if (user.getText().equals("admin") && pass.getText().equals("password")) {
            actiontarget.setText("Login Successful");
        }
        else {
            actiontarget.setText("Invalid Login Credentials");
        }

    }
}
