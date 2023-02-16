import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class BlueController {
    public ImageView mainForm;

    public void OnActionAdmin(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)mainForm.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("Admin.fxml"))));
    }

    public void OnActionReception(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)mainForm.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("Receptionist.fxml"))));
    }
}
