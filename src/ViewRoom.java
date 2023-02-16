import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
 public class ViewRoom {
    public TableColumn rId;
    public TableColumn rType;
    public TableColumn BedCount;
    public TableColumn BathCount;
    public TableView cAdd;


    public void initialize(){

        rId.setCellValueFactory(new PropertyValueFactory<>("id"));
        rType.setCellValueFactory(new PropertyValueFactory<>("type"));
        BedCount.setCellValueFactory(new PropertyValueFactory<>("bed"));
        BathCount.setCellValueFactory(new PropertyValueFactory<>("bath"));
        AddRoomController.obList.add(new AddRoom("R001","Single","1","1"));
        AddRoomController.obList.add(new AddRoom("R002","Double","1","1"));
        AddRoomController.obList.add(new AddRoom("R003","Triple","2","2"));
        AddRoomController.obList.add(new AddRoom("R004","Luxury","3","2"));
        cAdd.setItems(AddRoomController.obList);
    }
    public ImageView roomClear;
    public void AddRoom(ActionEvent event) {

    }

     public void OnActionBack(ActionEvent actionEvent) throws IOException {
         Stage window =(Stage)roomClear.getScene().getWindow();
         window.setScene(new Scene(FXMLLoader.load(getClass().getResource("clearRoomDetails.fxml"))));
     }
 }

