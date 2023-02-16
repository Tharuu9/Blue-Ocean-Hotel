import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class EditRoomController {
    public Label roomE1;
    public Label roomE3;
    public Label roomE5;
    public TextField roomE2;
    public TextField roomE4;
    public TextField roomE6;
    public Label wrongId;
    public AnchorPane EditRoom;
    public Label EnterId;
    public TextField roomId;
    public Button btnEdit;
    AddRoom isChange;

    public void OnActionEdit(ActionEvent actionEvent) {
        String id = roomId.getText();
        if (isCheck(id)) {
//
            roomE1.setVisible(true);
            roomE2.setVisible(true);
            roomE3.setVisible(true);
            roomE4.setVisible(true);
            roomE5.setVisible(true);
            roomE6.setVisible(true);
            isChange.setType(roomE2.getText());
            isChange.setBath(roomE6.getText());
            isChange.setBed(roomE4.getText());
            btnEdit.setVisible(true);
        }else{
            wrongId.setVisible(true);
        }

    }
    public boolean isCheck(String id) {
        for(AddRoom r:AddRoomController.obList){
            if(r.getId().equals(id)){
                isChange=r;
                return true;
            }

        }
        Alert a=new Alert(Alert.AlertType.WARNING,"Id Is not Found");
        a.show();
        return false;


    }
    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) EditRoom.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("clearRoomDetails.fxml"))));
    }
}


