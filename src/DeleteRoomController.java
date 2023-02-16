import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteRoomController {
    public AnchorPane deleteRoomFrom;
    public TextField DeleteId;
    public Label lblRoomId;
    public Label lblDelete;
    AddRoom isDelete;

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) deleteRoomFrom.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("clearRoomDetails.fxml"))));
    }

    public void OnActionDelete(ActionEvent actionEvent) {
        String id=DeleteId.getText();
        if(isCheck(id)){
            AddRoomController.obList.remove(isDelete);
            lblDelete.setVisible(true);
        }
    }
    public boolean isCheck(String id){
        for(AddRoom r:AddRoomController.obList){
            if(r.getId().equals(id)){
                isDelete=r;
                return true;

            }
        }
        Alert a=new Alert(Alert.AlertType.WARNING,"Id Is not Found");
        a.show();
        return false;
    }
}

