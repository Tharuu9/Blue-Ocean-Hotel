import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowMealController {
    public TableView showMeals;
    public TableColumn foodId;
    public TableColumn foodType;
    public TableColumn foodQuantity;
    public TableColumn foodPrice;
    public AnchorPane ShowMeal;

    public void initialize() {
        foodId.setCellValueFactory(new PropertyValueFactory<>("foodId"));
        foodType.setCellValueFactory(new PropertyValueFactory<>("foodType"));
        foodQuantity.setCellValueFactory(new PropertyValueFactory<>("foodQuantity"));
        foodPrice.setCellValueFactory(new PropertyValueFactory<>("foodPrice"));
        AddFoodController.ObList1.add(new AddFood("001", "Kottu", "2", "1600"));
        AddFoodController.ObList1.add(new AddFood("002", "Mix Rice", "3", "2000"));
        AddFoodController.ObList1.add(new AddFood("003", "Egg Rotti", "5", "500"));
        AddFoodController.ObList1.add(new AddFood("004", "BBQ", "4", "5000"));
        AddFoodController.ObList1.add(new AddFood("005", "Pizza", "1", "3500"));
        AddFoodController.ObList1.add(new AddFood("006", "Cheese Nasigrang", "6", "2500"));
        showMeals.setItems(AddFoodController.ObList1);
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)ShowMeal.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MealPack.fxml"))));
    }
}
