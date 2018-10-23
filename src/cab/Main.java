package cab;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	 launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    //Stage eto okno
        //Pane root  = new VBox();//FlowPane(); //Pane();
        //Button btn = new Button("OK");//pered scene
       // Label lbl  = new Label("Test label");
       // TextField txt = new TextField();
       // lbl.textProperty().bind(
      //          Bindings.concat("Hello, ", txt.textProperty(), "!")); //svjazali tekst labela s tekstom
        // btn.setOnAction(e -> {  lbl.setText("Hello, "+ txt.getText() +"!");  }      );

        // root.getChildren().addAll(btn,lbl,txt);
        Pane root = FXMLLoader.load(
                getClass().getResource("/cab/Main.fxml"));// zagruzili resurs

        Scene scene = new Scene(root,500,300);
        primaryStage.setTitle("Bulls and Cows");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
