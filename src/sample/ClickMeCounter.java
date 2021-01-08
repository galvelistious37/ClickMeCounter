package sample;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class ClickMeCounter extends Application {

    public static void main(String[] args){
        launch(args);
    }

    Button btn;
    Label lbl;
    int clickCounter = Constants.ZERO;

    @Override
    public void start(Stage primaryStage){
        btn = new Button(Constants.CLICK_ME);
        lbl = new Label(Constants.NO_CLICKS);

        // Create button and label
        btn.setOnAction(e -> buttonClick());

        // Set button and label to pane
        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        // Add pane to a scene
        Scene scene = new Scene(pane, 350, 250);

        // Add scene to stage
        primaryStage.setScene(scene);
        primaryStage.setTitle(Constants.TITLE);
        primaryStage.show();
    }

    private void buttonClick(){
        clickCounter++;
        String message = clickCounter > 1 ? Constants.MORE_THAN_ONE_FIRST + clickCounter + Constants.MORE_THAN_ONE_LAST : Constants.ONE_CLICK;
        lbl.setText(message);
    }
}
