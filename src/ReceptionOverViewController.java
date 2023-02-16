import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionOverViewController {
    public AnchorPane OverViewReception;

    public void OnActionReserveRoom(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverViewReception.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("viewRoom.fxml"))));

    }

    public void OnActionMaintenance(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverViewReception.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("EditRoom.fxml"))));

    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverViewReception.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("Receptionist.fxml"))));
    }

    public void OnActionNext(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverViewReception.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ShowMeal.fxml"))));
    }
}
