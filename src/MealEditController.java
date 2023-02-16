import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealEditController {
    public TextField mealId;
    public Label mealTy;
    public TextField mealType;
    public Label mealQuan;
    public TextField mealQuantity;
    public Label mealPri;
    public TextField mealPrice;
    public Label wrongId;
    public AnchorPane EditMeal;
    public Label EditSuccess;
    public Label EnterId;
    public Button btnEdit;
    AddFood isChange;

    public void OnActionEdit(ActionEvent actionEvent) {
        String id = mealId.getText();

        if (isCheck(id)) {
            mealPri.setVisible(true);
            mealPrice.setVisible(true);
            mealQuan.setVisible(true);
            mealQuantity.setVisible(true);
            mealTy.setVisible(true);
            mealType.setVisible(true);
            isChange.setFoodprice(mealPrice.getText());
            isChange.setFoodQuantity(mealQuantity.getText());
            isChange.setFoodType(mealType.getText());

        } else {
            wrongId.setVisible(true);
        }

    }
    public boolean isCheck(String id) {
        for (AddFood h : AddFoodController.ObList1){
            if (h.getFoodId().equals(id)){
                isChange = h;
                EditSuccess.setVisible(true);
                return true;
            }
        }
        return false;

    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) EditMeal.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MealPack.fxml"))));
    }
}