package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javax.vecmath.Vector2d;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        final double resRAtio = 0.7;
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        Rectangle2D windowRes = new Rectangle2D(0, 0, primaryScreenBounds.getMaxX() * resRAtio,  primaryScreenBounds.getMaxY() * resRAtio);

        Group root = new Group();
        Scene theScene = new Scene( root );
        primaryStage.setScene( theScene );

        Canvas canvas = new Canvas(windowRes.getMaxX(), windowRes.getMaxY());
        root.getChildren().add( canvas );

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill( Color.RED );
        Font theFont = Font.font( "Times New Roman", FontWeight.NORMAL, 12 );
        gc.setFont( theFont );
        gc.fillText( "Hello, World!", 10, 10 );

        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
