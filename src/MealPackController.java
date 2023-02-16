import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPackController {

    public AnchorPane MealPackage;

    public void OnActionAddMeal(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)MealPackage.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("addFood.fxml"))));
    }

    public void OnActionDeleteMeals(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) MealPackage.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("deleteMeal.fxml"))));
    }

    public void OnActionUpdateMeals(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) MealPackage.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("mealEdit.fxml"))));
    }

    public void OnActionShowMeals(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)MealPackage.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ShowMeal.fxml"))));
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)MealPackage.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminOverView.fxml"))));
    }
}
