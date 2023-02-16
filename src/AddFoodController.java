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

public class AddFoodController {
    public TextField foodId;
    public TextField foodType;
    public TextField foodQuantity;
    public TextField foodPrice;
    static ObservableList<AddFood>ObList1 = FXCollections.observableArrayList();
    public Label saveFood;
    public AnchorPane addMeal;

    public void initialize(){
    }

    public void OnActionAddMeal(ActionEvent actionEvent) {
        String id = foodId.getText();
        String type = foodType.getText();
        String quantity = foodQuantity.getText();
        String price = foodPrice.getText();
        ObList1.add(new AddFood(id,type,quantity,price));
        saveFood.setVisible(true);
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) addMeal.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MealPack.fxml"))));
    }
}
