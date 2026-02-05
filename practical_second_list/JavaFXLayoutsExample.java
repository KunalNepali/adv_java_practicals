import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXLayoutsExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        // HBox layout
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(
                new Button("Button 1"),
                new Button("Button 2")
        );

        // VBox layout
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(
                new Button("Button A"),
                new Button("Button B")
        );

        // GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(new Button("Grid 1"), 0, 0);
        gridPane.add(new Button("Grid 2"), 1, 0);
        gridPane.add(new Button("Grid 3"), 0, 1);
        gridPane.add(new Button("Grid 4"), 1, 1);

        // StackPane layout
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(
                new Button("Back"),
                new Button("Next")
        );

        // BorderPane layout
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Button("Top"));
        borderPane.setBottom(new Button("Bottom"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setRight(new Button("Right"));
        borderPane.setCenter(new Button("Center"));

        // AnchorPane layout
        AnchorPane anchorPane = new AnchorPane();
        Button anchorButton = new Button("Anchor Button");
        anchorPane.getChildren().add(anchorButton);
        AnchorPane.setTopAnchor(anchorButton, 50.0);
        AnchorPane.setLeftAnchor(anchorButton, 50.0);

        // Main VBox
        VBox mainVBox = new VBox(20);
        mainVBox.setPadding(new Insets(15));
        mainVBox.getChildren().addAll(hBox, vBox, gridPane, stackPane, borderPane, anchorPane);

        Scene scene = new Scene(mainVBox, 600, 600);

        primaryStage.setTitle("JavaFX Layouts Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/* Commands to run these:
Compile:
javac --module-path ~/Downloads/openjfx-21.0.10_linux-x64_bin-sdk/javafx-sdk-21.0.10/lib \
      --add-modules javafx.controls,javafx.fxml \
      JavaFXLayoutsExample.java

run:
java --module-path ~/Downloads/openjfx-21.0.10_linux-x64_bin-sdk/javafx-sdk-21.0.10/lib \
     --add-modules javafx.controls,javafx.fxml \
     JavaFXLayoutsExample

 */