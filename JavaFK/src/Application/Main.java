package Application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import java.util.List;

public class Main extends Application{

    public static void main(String[] args) {

        System.out.println("Launching Application");
        launch(args);
    }

    @Override
    public void init() throws Exception {

        System.out.println("Application inits");
        super.init();
    }
    @Override
    public void start(Stage stage) {

        System.out.println("Application starts");

        // получаем переданные параметры
        Application.Parameters params = getParameters();
        List<String> unnamedParams = getParameters().getUnnamed();
        int i =0;
        for(String param: unnamedParams){
            i++;
            System.out.printf("%d - %s \n", i, param);
        }

        stage.show();
    }
    @Override
    public void stop() throws Exception {

        System.out.println("Application stops");
        super.stop();
    }
}