import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class clearRoomDetailsController {
    public AnchorPane clearRoomDetails;

    public void OnActionShowRoom(ActionEvent actionEvent) {
    }

    public void OnActionEditRoom(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)clearRoomDetails.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("EditRoom.fxml"))));
    }

    public void OnActionDelete(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)clearRoomDetails.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("DeleteRoom.fxml"))));
    }

    public void OnActionAddRoom(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)clearRoomDetails.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("viewRoom.fxml"))));
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)clearRoomDetails.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminOverView.fxml"))));


    }
}

