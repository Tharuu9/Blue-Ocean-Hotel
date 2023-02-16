import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddRoomController  {
    public TextField RoomId;
    public TextField RoomType;
    public TextField BedCount;
    public TextField BathCount;
    static ObservableList <AddRoom> obList= FXCollections.observableArrayList();
    public AnchorPane roomAdmin;
    public Label saves;

    public void initialize() {

    }
    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)roomAdmin.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("clearRoomDetails.fxml"))));
        System.out.println("Click On");
    }

    public void OnActionAdd(ActionEvent actionEvent) {
        String id=RoomId.getText();
        String type=RoomType.getText();
        String bed=BedCount.getText();
        String bath=BathCount.getText();
        obList.add(new AddRoom(id,type,bed,bath));
        saves.setVisible(true);
    }
}




