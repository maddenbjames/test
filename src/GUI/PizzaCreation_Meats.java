package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class PizzaCreation_Meats {
    //Buttons for Pizza Creation Menus initiated.
    private Button MainMenu = new Button("Main Menu");
    private Button Cart_btn = new Button("Go To Cart");
    private Button Back_btn = new Button("Back to Cheeses");
    private Button Crust_btn = new Button("Crust");
    private Button Cheese_btn = new Button("Cheese");
    private Button Meats_btn = new Button("Meats");
    private Button Veggies_btn = new Button ("Veggies");
    private Button Next_btn = new Button("Next");

    //Radio Buttons used for the Meats menu
    //Pepperoni radios
    private RadioButton PepperoniLeft_radio = new RadioButton();
    private RadioButton PepperoniRight_radio = new RadioButton();
    private RadioButton PepperoniWhole_radio = new RadioButton();

    //Sausage radios
    private RadioButton SausageLeft_radio = new RadioButton();
    private RadioButton SausageRight_radio = new RadioButton();
    private RadioButton SausageWhole_radio = new RadioButton();

    //Ham radios
    private RadioButton HamLeft_radio = new RadioButton();
    private RadioButton HamRight_radio = new RadioButton();
    private RadioButton HamWhole_radio = new RadioButton();

    //Canadian Bacon radios
    private RadioButton CanadianLeft_radio = new RadioButton();
    private RadioButton CanadianRight_radio = new RadioButton();
    private RadioButton CanadianWhole_radio = new RadioButton();

    //Labels for the meats menu
    private Label PriceInfo_Lbl= new Label("Price Info");
    private Label Meats_Lbl = new Label("Meats");
    private Label Pepperoni_Lbl = new Label("Pepperoni");
    private Label Sausage_Lbl = new Label("Sausage");
    private Label Ham_Lbl = new Label("Ham");
    private Label CanadianBacon_Lbl = new Label("Canadian Bacon");

    //Constants in every scene
    private Image Template = new Image("GUI/PizzaProject Info Template_Back.png");
    private Image Pep_pic = new Image("GUI/pepperoni1.jpg");
    private Image Sau_pic = new Image("GUI/sausage1.jpg");
    private Image ham_pic = new Image("GUI/ham1.jpg");
    private Image CBacon_pic = new Image("GUI/canadian bacon1.jpg");
    private Image WholePizza_pic = new Image("GUI/Whole.jpg");
    private Image LeftHalf_pic = new Image("GUI/LeftHalf.jpg");
    private Image RightHalf_pic = new Image("GUI/RightHalf.jpg");

    //This method is where the look and feel of the meats menu derives
    public VBox BuildMeats(Stage window){

        VBox vb1 = new VBox(1);
        VBox vb2 = new VBox(1);

        HBox hb0 = new HBox(100);
        HBox hb1 = new HBox(100);
        HBox hb2 = new HBox(100);
        HBox hb3 = new HBox(100);
        HBox hb4 = new HBox(100);
        HBox hb5 = new HBox(97);
        HBox hb6 = new HBox(200);// nav bar
        HBox hb7 = new HBox(100);
        HBox hb8 = new HBox(100);
        HBox hb9 = new HBox(20);
        HBox hb10 = new HBox(80);

        HBox hb13 = new HBox(100);

        //Padding for the VBoxes
        vb2.setPadding(new Insets(-17,0,0,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb13.setPadding(new Insets(-83,0,0,0));
        hb0.setPadding(new Insets(-135,0,0,0));// cart button
        hb1.setPadding(new Insets(-83,0,0,0));
        hb2.setPadding(new Insets(0,45,0,10));//pepperoni
        hb3.setPadding(new Insets(0,30,0,10));//sausage
        hb4.setPadding(new Insets(0,10,0,15));//ham
        hb5.setPadding(new Insets(0,90,0,10));//canadian bacon
        hb6.setPadding(new Insets(58,0,0,0));//nav bar
        hb7.setPadding(new Insets(0,10,0,10));
        hb9.setPadding(new Insets(-40,20,0,0));
        hb10.setPadding(new Insets(0,0,0,125));

        //Alignment for the HBoxes
        hb0.setAlignment(Pos.CENTER_RIGHT);
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
        hb5.setAlignment(Pos.CENTER);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.CENTER);
        hb10.setAlignment(Pos.CENTER);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb13.setOpacity(0);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb2.setStyle(borderLayout);
        hb3.setStyle(borderLayout);
        hb4.setStyle(borderLayout);
        hb5.setStyle(borderLayout);
        hb7.setStyle(borderLayout);

        //Sets the all components onto the scene
        hb13.getChildren().addAll(MainMenu);
        hb0.getChildren().addAll(Cart_btn);
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(new ImageView(Pep_pic), Pepperoni_Lbl, PepperoniLeft_radio, PepperoniRight_radio, PepperoniWhole_radio);
        hb3.getChildren().addAll(new ImageView(Sau_pic), Sausage_Lbl, SausageLeft_radio, SausageRight_radio, SausageWhole_radio);
        hb4.getChildren().addAll(new ImageView(ham_pic), Ham_Lbl, HamLeft_radio, HamRight_radio, HamWhole_radio);
        hb5.getChildren().addAll(new ImageView(CBacon_pic), CanadianBacon_Lbl, CanadianLeft_radio, CanadianRight_radio, CanadianWhole_radio);
        hb6.getChildren().addAll(Crust_btn, Cheese_btn, Meats_btn, Veggies_btn, Next_btn);
        hb7.getChildren().addAll(PriceInfo_Lbl);
        hb8.getChildren().addAll(vb1, hb7);
        hb9.getChildren().addAll(Meats_Lbl);
        hb10.getChildren().addAll(new ImageView(LeftHalf_pic),new ImageView(RightHalf_pic),new ImageView(WholePizza_pic));

        vb1.getChildren().addAll(hb2, hb3, hb4, hb5);
        vb2.getChildren().addAll(new ImageView(Template), hb13, hb0, hb1, hb9, hb10, hb8, hb6);

        //Calls other methods in this class
        FontsUsed();
        Meats_ButtonAction(window);
        Meats_RadioButtons();

        return vb2;
    }

    //This method is to handle to radio button toggle for the Meats menu
    private void Meats_RadioButtons(){
        //Toggle Group for pepperoni radio buttons
        final ToggleGroup group1 = new ToggleGroup();
        PepperoniLeft_radio.setToggleGroup(group1);
        PepperoniRight_radio.setToggleGroup(group1);
        PepperoniWhole_radio.setToggleGroup(group1);

        //ToggleGroup or sausage radio buttons
        final ToggleGroup group2 = new ToggleGroup();
        SausageLeft_radio.setToggleGroup(group2);
        SausageRight_radio.setToggleGroup(group2);
        SausageLeft_radio.setToggleGroup(group2);

        //ToggleGroup for Ham radio Buttons
        final ToggleGroup group3 = new ToggleGroup();
        HamLeft_radio.setToggleGroup(group3);
        HamRight_radio.setToggleGroup(group3);
        HamWhole_radio.setToggleGroup(group3);

        //ToggleGroup for Canadian Bacon radio buttons
        final ToggleGroup group4 = new ToggleGroup();
        CanadianLeft_radio.setToggleGroup(group4);
        CanadianRight_radio.setToggleGroup(group4);
        CanadianWhole_radio.setToggleGroup(group4);
    }
    //This method is to handle to button activations for the Meats menu
    private void Meats_ButtonAction(Stage window){
        //Sets the size of the buttons to match the template
        Back_btn.setPrefSize(125,75);
        MainMenu.setPrefSize(125,75);
        Cart_btn.setPrefSize(125,75);
        Crust_btn.setPrefSize(100,35);
        Cheese_btn.setPrefSize(100,35);
        Meats_btn.setPrefSize(100,35);
        Veggies_btn.setPrefSize(100,35);
        Next_btn.setPrefSize(100,50);

        /*disables the button since the user will already be on this page. No need to navigate
          to a page they are already on or an accidental refresh.*/
        Meats_btn.setDisable(true);

        //Classes for scene navigation
        MainMenu mm = new MainMenu();
        Cart cart = new Cart();
        PizzaCreation_Crust pizzaCreation_crust = new PizzaCreation_Crust();
        PizzaCreation_Cheese pizzaCreation_cheese = new PizzaCreation_Cheese();
        PizzaCreation_Meats pizzaCreation_meats = new PizzaCreation_Meats();
        PizzaCreation_Veggies pizzaCreation_veggies = new PizzaCreation_Veggies();

        //Button Actions
        MainMenu.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        Cart_btn.setOnAction(e -> window.getScene().setRoot(cart.BuildCart(window)));
        Back_btn.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        Crust_btn.setOnAction(e -> window.getScene().setRoot(pizzaCreation_crust.BuildCrust(window)));
        Cheese_btn.setOnAction(e -> window.getScene().setRoot(pizzaCreation_cheese.BuildCheese(window)));
        Meats_btn.setOnAction(e -> window.getScene().setRoot(pizzaCreation_meats.BuildMeats(window)));
        Veggies_btn.setOnAction(e -> window.getScene().setRoot(pizzaCreation_veggies.BuildVeggies(window)));
        Next_btn.setOnAction(e -> window.getScene().setRoot(pizzaCreation_veggies.BuildVeggies(window)));
    }

    private void FontsUsed(){
        //SetsFonts for all the labels
        Meats_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        PriceInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Pepperoni_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Sausage_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Ham_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CanadianBacon_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        PriceInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets Fonts for all the Buttons
        Cart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Crust_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cheese_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Meats_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Veggies_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Next_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
