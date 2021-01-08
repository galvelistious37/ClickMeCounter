package sample;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class ClickMeCounter extends Application {

    /**
     * main method to start the program. Method calls
     * launch(args) to start the javafx program.
     * @param args
     */
    public static void main(String[] args){
        launch(args);
    }

    private Label lbl;
    private int clickCounter = Constants.ZERO;

    @Override
    public void start(Stage primaryStage){
        Button btn = new Button(Constants.CLICK_ME);
        Button quitButton = new Button(Constants.QUIT);
        lbl = new Label(Constants.NO_CLICKS);

        // Create button and label
        btn.setOnAction(e -> buttonClick());
        quitButton.setOnAction(e -> quit());

        // Set button and label to pane
        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);
        pane.setBottom(quitButton);

        // Add pane to a scene
        Scene scene = new Scene(pane, 350, 250);

        // Add scene to stage
        primaryStage.setScene(scene);
        primaryStage.setTitle(Constants.TITLE);
        primaryStage.show();
    }

    /**
     * Increases the counter total value by one and sets
     * a text value based on the counter total.
     */
    private void buttonClick(){
        clickCounter++;
        String message = clickCounter > 1 ? Constants.MORE_THAN_ONE_FIRST + clickCounter + Constants.MORE_THAN_ONE_LAST : Constants.ONE_CLICK;
        lbl.setText(message);
    }

    /**
     * Quits the program
     */
    private void quit(){
        System.exit(0);
    }
}
