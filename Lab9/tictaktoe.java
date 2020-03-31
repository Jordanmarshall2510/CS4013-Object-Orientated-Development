import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.image.*;
import java.lang.Math;

public class tictaktoe extends Application{

    int xCounter = 0;
    int oCounter = 0;

    @Override
    public void start(Stage tictaktoe){
        GridPane grid = new GridPane();
        
        Button one = new Button("",setImageRandom());
        grid.add(one,0,0);
        one.setPrefSize(100,100);

        Button two = new Button("",setImageRandom());
        grid.add(two,1,0);
        two.setPrefSize(100,100);

        Button three = new Button("",setImageRandom());
        grid.add(three,2,0);
        three.setPrefSize(100,100);

        Button four = new Button("",setImageRandom());
        grid.add(four,2,1);
        four.setPrefSize(100,100);

        Button five = new Button("",setImageRandom());
        grid.add(five,1,1);
        five.setPrefSize(100,100);

        Button six = new Button("",setImageRandom());
        grid.add(six,0,1);
        six.setPrefSize(100,100);

        Button seven = new Button("",setImageRandom());
        grid.add(seven,2,2);
        seven.setPrefSize(100,100);

        Button eight = new Button("",setImageRandom());
        grid.add(eight,1,2);
        eight.setPrefSize(100,100);

        Button nine = new Button("",setImageRandom());
        grid.add(nine,0,2);
        nine.setPrefSize(100,100);

        Scene scene = new Scene(grid,300,300);
        
        
        tictaktoe.setTitle("Tic-Tak-Toe");
        tictaktoe.setScene(scene);
        tictaktoe.show();
        
    }

    public ImageView setImageRandom(){

        Image oImage = new Image(getClass().getResourceAsStream("o.gif"));
        Image xImage = new Image(getClass().getResourceAsStream("x.gif"));

        ImageView o = new ImageView(oImage);
        ImageView x = new ImageView(xImage);

        int random = (int)(Math.random() * 2);

        if (random == 0 || oCounter < 5){
            oCounter++;
            return o;
        }else{
            return x;
        }

    }
}
