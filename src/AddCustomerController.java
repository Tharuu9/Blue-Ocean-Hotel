import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddCustomerController {


    public AnchorPane CustomerAdd;
    public TableColumn CustName;
    public TableColumn CustId;
    public TableColumn CustAddress;
    public TableColumn CustNo;
    public TableColumn CustEmail;
    public TableView CustView;
    public TextField enterId;
    public TextField enterName;
    public TextField enterAddress;
    public TextField ContactNo;
    public TextField emailText;
    public TableColumn ContactNumber;
    public TextField EnterId;
    public TextField EnterName;
    public TextField EnterAddress;
    public TextField EmailText;
    AddCustomer isEdit;
    AddCustomer idDelete;


    static ObservableList<AddCustomer> Oblist2 = FXCollections.observableArrayList();

    public void initialize() {
        CustName.setCellValueFactory(new PropertyValueFactory<>("IdNumber"));
        CustId.setCellValueFactory(new PropertyValueFactory<>("CustEmail"));
        CustAddress.setCellValueFactory(new PropertyValueFactory<>("CustAddress"));
        CustNo.setCellValueFactory(new PropertyValueFactory<>("ContactNumber"));
        CustEmail.setCellValueFactory(new PropertyValueFactory<>("CustName"));
        CustView.setItems(AddCustomerController.Oblist2);
    }

    public boolean ischeck1(String idf) {
        for (AddCustomer u : AddCustomerController.Oblist2){
            if(u.getCustId().equals(idf)){
                idDelete=u;
                return true;
            }
        }
        return false;

    }

    public void OnActionSaveDetails(ActionEvent actionEvent) {
        String id = enterId.getText();
        String name = enterName.getText();
        String address = enterAddress.getText();
        String contact = ContactNo.getText();
        String email = emailText.getText();
        AddCustomer c=new AddCustomer();
        Oblist2.add(new AddCustomer(id,name,address,contact,email));
    }

    public void OnActionEditDetails(ActionEvent actionEvent) {
        String id = enterId.getText();
        if(true){
            isEdit.setCustName(enterName.getText());
            isEdit.setCustAddress(enterAddress.getText());
            isEdit.setContactNumber(ContactNo.getText());
            isEdit.setCustEmail(emailText.getText());


        }
    }
    public boolean isCheck(String id) {
        for (AddCustomer a : AddCustomerController.Oblist2){
            if(a.getCustId().equals(id)){
                isEdit=a;
                return true;
            }
        }
        return false;
    }

    public void OnActionDeleteDetails(ActionEvent actionEvent) {
        String idf = enterId.getText();
        if(ischeck1(idf)){
            AddCustomerController.Oblist2.remove(idDelete);
        }
    }

    public void OnActionBooking(ActionEvent actionEvent) {
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage)CustomerAdd.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("blue.fxml"))));
        System.out.println("Click On");
    }
}
