import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
public class microwave extends Application{
    @Override
    public void start(Stage microwave){
        BorderPane border = new BorderPane(); 
        GridPane grid = new GridPane();
        HBox hbox = new HBox();
        border.setTop(hbox);
        
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));
        TextField timeDisplay = new TextField("Time to be displayed here");  
        Button food = new Button("Place Food Here");
        food.setPrefSize(100, 200);
        
        Button one = new Button("1");
        grid.add(one,1,1);

        Button two = new Button("2");
        grid.add(two,2,1);

        Button three = new Button("3");
        grid.add(three,3,1);

        Button four = new Button("4");
        grid.add(four,1,2);

        Button five = new Button("5");
        grid.add(five,2,2);

        Button six = new Button("6");
        grid.add(six,3,2);

        Button seven = new Button("7");
        grid.add(seven,1,3);

        Button eight = new Button("8");
        grid.add(eight,2,3);

        Button nine = new Button("9");
        grid.add(nine,3,3);

        Button zero = new Button("0");
        grid.add(zero,1,4);

        Button start = new Button("Start");
        grid.add(start,2,4);

        Button stop = new Button("Stop");
        grid.add(stop,3,4);

        GridPane text = new GridPane();
        text.setPadding(new Insets(50,0,10,120));
        text.add(timeDisplay,4,2);

        GridPane foodGrid = new GridPane();
        foodGrid.setPadding(new Insets(10,10,10,10));
        foodGrid.add(food,4,2);

        border.setCenter(grid);
        border.setTop(text);
        border.setLeft(foodGrid);
        Scene scene = new Scene(border,350,300);
        
        
        //scene.getChildren().add(timeDisplay);
        //border.setCenter(grid);
        //border.setTop(timeDisplay);
        microwave.setTitle("Microwave");
        microwave.setScene(scene);
        microwave.show();
        
    }
}
