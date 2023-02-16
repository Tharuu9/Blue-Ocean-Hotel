import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminOverViewController {
    public AnchorPane OverView;

    public void OnActionRoomDetails(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverView.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("clearRoomDetails.fxml"))));
    }

    public void OnActionMealPack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverView.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MealPack.fxml"))));
    }

    public void OnActionIncome(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverView.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("Income.fxml"))));
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)OverView.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("Admin.fxml"))));
    }
}
