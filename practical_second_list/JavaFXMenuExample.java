import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXMenuExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");

        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        MenuItem saveFile = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        exitItem.setOnAction(event -> primaryStage.close());

        fileMenu.getItems().addAll(
                newFile,
                openFile,
                saveFile,
                new SeparatorMenuItem(),
                exitItem
        );

        // Help Menu
        Menu helpMenu = new Menu("Help");

        MenuItem aboutItem = new MenuItem("About");
        aboutItem.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("About");
            alert.setHeaderText("About This Application");
            alert.setContentText("This is a JavaFX Menu Example.");
            alert.showAndWait();
        });

        helpMenu.getItems().add(aboutItem);

        menuBar.getMenus().addAll(fileMenu, helpMenu);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(new Label("Main Content Area"));

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX Menu Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*Compile and run:
compile:
javac --module-path ~/Downloads/openjfx-21.0.10_linux-x64_bin-sdk/javafx-sdk-21.0.10/lib       --add-modules javafx.controls,javafx.fxml       JavaFXMenuExample.java

run:
java --module-path ~/Downloads/openjfx-21.0.10_linux-x64_bin-sdk/javafx-sdk-21.0.10/lib      --add-modules javafx.controls,javafx.fxml      JavaFXMenuExample
*/