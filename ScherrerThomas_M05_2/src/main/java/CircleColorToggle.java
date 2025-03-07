import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class CircleColorToggle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(50, Color.WHITE);

        circle.setOnMousePressed((MouseEvent e) -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased((MouseEvent e) -> circle.setFill(Color.WHITE));

        StackPane root = new StackPane(circle);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Mouse Press Circle Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

