package GUI;

//javafx packages
import sample.Order;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application{

    private Stage window;

    private Scene login_menu;

    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Mom And Pop Pizza");//Name of the window

        LoginMenu loginMenu = new LoginMenu();

        login_menu = new Scene(loginMenu.BuildLogin(window), 1366, 786);

        window.setScene(login_menu);
        window.show();
    }

    static Order order = new Order();

    static Order getOrder() {
        return order;
    }
}
