import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteMealController {
    public AnchorPane deleteBack;
    public Label sDelete;
    public TextField FoodId;
    AddFood isDelete;

    public boolean isCheck(String id) {
        for (AddFood p : AddFoodController.ObList1){
            if (p.getFoodId().equals(id)){
                isDelete=p;
                sDelete.setVisible(true);
                return true;

            }
        }
        Alert a = new Alert(Alert.AlertType.WARNING,"Id is not found");
        a.show();
        return false;

    }

    public void OnActionDelete(ActionEvent actionEvent) {
        String id = FoodId.getText();
        if (isCheck(id)){
            AddFoodController.ObList1.remove(isDelete);

        }
    }
    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) deleteBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MealPack.fxml"))));
    }
}
