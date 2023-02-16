import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomeController {
    public AnchorPane backIncome;
    public Button btnMonthlyRep;
    public Button btnYearlyRep;
    public Button btnBack;

    public void OnActionMonthlyRep(ActionEvent actionEvent) {
    }

    public void OnActionYearlyRep(ActionEvent actionEvent) {
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)backIncome.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminOverView.fxml"))));
    }
}
