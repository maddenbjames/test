package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CreateAccount {
    //buttons used in this box
    private Button CreateAccount_btn = new Button("Create Account");
    private Button Back_btn = new Button("Back");//GOES BK TO LOGIN MENU

    //Labels and image template used in his window
    private Label email_Lbl = new Label("Enter Your Email Address:");
    private Label password_lbl = new Label("Enter Your Password:");
    private Label ConfirmPassword_lbl = new Label("Confirm Your Password:");

    //Text and password fields used fro the create account window
    private PasswordField NewPassword = new PasswordField();
    private PasswordField ConfirmNewPassword = new PasswordField();
    private TextField NewEmail = new TextField();

    //Images used for this scene
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");

    public VBox PopUpBox(Stage window){
        VBox vb1 = new VBox(50);

        HBox hb0 = new HBox(50);
        HBox hb1 = new HBox(20);
        HBox hb2 = new HBox(20);
        HBox hb3 = new HBox(20);
        HBox hb4 = new HBox(20);

        //Padding and alignment for VBoxes and HBoxes are initiated.
        vb1.setPadding(new Insets(0, 0, 140, 0));//Scoots everything in vb1 down a few spaces

        hb0.setPadding(new Insets(-170, 0, 0, 0));
        hb2.setPadding(new Insets(0, 0, 0, 45));
        hb3.setPadding(new Insets(0, 0, 0, 20));

        vb1.setAlignment(Pos.CENTER);//puts the picture on the top and center of the scene
        vb1.setAlignment(Pos.CENTER);

        hb0.setAlignment(Pos.CENTER_LEFT);
        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);

        hb0.setOpacity(0);

        //Sets the all components onto the scene
        hb0.getChildren().addAll(Back_btn);
        hb1.getChildren().addAll(email_Lbl, NewEmail);
        hb2.getChildren().addAll(password_lbl, NewPassword);
        hb3.getChildren().addAll(ConfirmPassword_lbl, ConfirmNewPassword);
        hb4.getChildren().addAll(CreateAccount_btn);
        vb1.getChildren().addAll(new ImageView(Template), hb0, hb1, hb2, hb3, hb4);

        CreatAccount_ButtonActions(window);
        FontsUsed();

        return vb1;
    }

    private void CreatAccount_ButtonActions(Stage window){
        //sts the size of the back Button
        Back_btn.setPrefSize(125,75);
        CreateAccount_btn.setPrefSize(300,100);

        //creates a class for the main menu
        MainMenu mm = new MainMenu();
        LoginMenu loginMenu = new LoginMenu();

        //Sets button action for create account to take user to the main menu
        CreateAccount_btn.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        Back_btn.setOnAction(e -> window.getScene().setRoot(loginMenu.BuildLogin(window)));
    }
    private void FontsUsed(){
        email_Lbl.setFont(Font.font("Calibri", 24));
        password_lbl.setFont(Font.font("Calibri", 24));
        NewEmail.setFont(Font.font("Calibri", 24));
        NewPassword.setFont(Font.font("Calibri", 24));
        ConfirmNewPassword.setFont(Font.font("Calibri", 24));
        ConfirmPassword_lbl.setFont(Font.font("Calibri", 24));
        CreateAccount_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
