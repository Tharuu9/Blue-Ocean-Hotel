import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistController {
    static String names[]=new String[10];
    public AnchorPane ReceptionLog;
    public TextField userName;
    public TextField Password;
    public Label wrong;

    public void OnActionLogin(ActionEvent actionEvent) throws IOException {
        names[0]="Tharuka";
        names[1]="1234";
        if(userName.getText().equals(names[0]) && Password.getText().equals(names[1])){
            Stage Window =(Stage)ReceptionLog.getScene().getWindow();
            Window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionOverView.fxml"))));

        }else {
            wrong.setVisible(true);
        }
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)ReceptionLog.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("blue.fxml"))));
    }
}
