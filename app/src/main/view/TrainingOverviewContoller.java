package main.view;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.IntegerPropertyBase;
import javafx.beans.property.ObjectProperty;
import javafx.scene.control.cell.PropertyValueFactory;
import main.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import main.model.Training;

import java.time.LocalDate;

public class TrainingOverviewContoller {

    @FXML
    private TableView<Training> trainingTable;
    @FXML
    private TableColumn<Training, String> trainingNameCol;
    @FXML
    private TableColumn<Training, Integer> amountOfEntrancesCol;
    @FXML
    private TableColumn<Training, String> lastActivityDateCol;

    //Reference to the main app
    private MainApp mainApp;

    public TrainingOverviewContoller(){};

    @FXML
    private void initialize(){
        trainingNameCol.setCellValueFactory(cellData -> cellData.getValue().trainingNameProperty());
        amountOfEntrancesCol.setCellValueFactory(cellData -> cellData.getValue().amountOfEntrancesProperty().asObject());
        lastActivityDateCol.setCellValueFactory(cellData -> cellData.getValue().lastActivityDateProperty().asString());
    }

}
