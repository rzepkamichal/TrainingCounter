package ch.makery.address.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.beans.property.*;

import java.time.LocalDate;

public class Training {

    private final StringProperty trainingName;
    private IntegerProperty amountOfEntrances;
    private ObjectProperty<LocalDate> lastActivityDate;


    public Training(){
        this(null,null,0);
    }

    @JsonCreator
    public Training(@JsonProperty("name") String trainingName,
                    @JsonProperty("date") LocalDate lastActivityDate,
                    @JsonProperty("entrances") int amountOfEntrances) {

        this.trainingName = new SimpleStringProperty(trainingName);
        this.amountOfEntrances = new SimpleIntegerProperty(amountOfEntrances);
        this.lastActivityDate = new SimpleObjectProperty<LocalDate>(LocalDate.from(lastActivityDate));
    }

    public String getTrainingName() {
        return trainingName.get();
    }

    public StringProperty trainingNameProperty() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName.set(trainingName);
    }

    public int getAmountOfEntrances() {
        return amountOfEntrances.get();
    }

    public IntegerProperty amountOfEntrancesProperty() {
        return amountOfEntrances;
    }

    public void setAmountOfEntrances(int amountOfEntrances) {
        this.amountOfEntrances.set(amountOfEntrances);
    }

    public LocalDate getLastActivityDate() {
        return lastActivityDate.get();
    }

    public ObjectProperty<LocalDate> lastActivityDateProperty() {
        return lastActivityDate;
    }

    public void setLastActivityDate(LocalDate lastActivityDate) {
        this.lastActivityDate.set(lastActivityDate);
    }


}
