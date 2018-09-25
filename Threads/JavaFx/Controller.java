package Threads.JavaFx;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;


public class Controller {
    private Task<ObservableList<String>> task;

    @FXML
    private ListView listView;

    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                ObservableList<String> employees = FXCollections.observableArrayList(
                        "Bill Rogers",
                        "Jac Jill",
                        "Mary Johnson",
                        "Bob Dan",
                        "Louis Qua"
                );

                return employees;
            }
        };

        listView.itemsProperty().bind(task.valueProperty());
    }

    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}
