import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class tempConvert extends Application {

    public boolean isEntered = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Celsius to Fahrenheit");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label celsius = new Label("Celsius:");
        grid.add(celsius, 0, 1);

        TextField celTextField = new TextField();
        grid.add(celTextField, 1, 1);

        Label fah = new Label("Fahrenheit:");
        grid.add(fah, 0, 2);

        TextField fahTextField = new TextField();
        grid.add(fahTextField, 1, 2);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        celTextField.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    fahTextField.setText(convertToFah(celTextField.getText()));
                }
            }
        });

        fahTextField.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    celTextField.setText(convertToCel(fahTextField.getText()));
                }
            }
        });

        Scene scene = new Scene(grid, 400, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String convertToFah(String celsiusVal){
        double value = Double.parseDouble(celsiusVal);
        double fahrenheit = (value*9/5)+32;
        String returnValue = String.valueOf(fahrenheit);
        return  returnValue;
    }

    public String convertToCel(String fahVal){
        double value = Double.parseDouble(fahVal);
        double fahrenheit = (value-32)*(5/9);
        String returnValue = String.valueOf(fahrenheit);
        return  returnValue;
    }


}