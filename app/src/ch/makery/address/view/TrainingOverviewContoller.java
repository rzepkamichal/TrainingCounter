package ch.makery.address.view;

import ch.makery.address.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ch.makery.address.model.Training;

public class TrainingOverviewContoller {

    @FXML
    private TableView<Training> trainingTable;
    @FXML
    private TableColumn<Training, String> trainingNameCol;
    @FXML
    private TableColumn<Training, String> amountOfEntrancesCol;
    @FXML
    private TableColumn<Training, String> lastActivityDateCol;

    //Reference to the main app
    private MainApp mainApp;

    public TrainingOverviewContoller(){};







}
