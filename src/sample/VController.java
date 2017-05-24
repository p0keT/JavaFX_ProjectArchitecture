package sample;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class VController implements IView{
    @FXML
    private Button ButWork;

    String[] str={""};

    @Override
    public void putText(String[] str) {
        this.str = str;
    }

    @Override
    public void startWork(int i) {
        ButWork.setText("Work started"+i);
    }

    @Override
    public IView getInstance() {
        return this;
    }
    @FXML
    public void initialize(){
        new MainController(getInstance());

    }

}
