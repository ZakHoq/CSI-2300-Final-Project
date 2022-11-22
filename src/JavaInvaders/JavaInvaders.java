package JavaInvaders;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaInvaders extends Application {

    Scene scene1, scene2, scene3;
        
    @Override
    public void start(Stage primaryStage) {
            
    primaryStage.setTitle("Java Invaders");
    
    //Scene 1
    Label Title= new Label("Java Invaders");
    Button Instructions= new Button("Instructions");
    Button Play = new Button("Play!");
    Instructions.setOnAction(e -> primaryStage.setScene(scene2));
    Play.setOnAction(e -> primaryStage.setScene(scene3));      
    VBox layout1 = new VBox(20);     
    layout1.getChildren().addAll(Title, Instructions, Play);
    scene1= new Scene(layout1, 800, 500);
                   
    //Scene 2
    Label Controls= new Label("Controls: ");
    Label MoveLeft= new Label("Left Arrow: Move Left");
    Label MoveRight= new Label("Right Arrow: Move Right");
    Label Shoot= new Label("Space: Shoot");
    Button Return2Main= new Button("Return To Home");
    Return2Main.setOnAction(e -> primaryStage.setScene(scene1));
    VBox layout2= new VBox(20);
    layout2.getChildren().addAll(Controls, Return2Main, MoveLeft, MoveRight, Shoot);
    scene2= new Scene(layout2,300,250);
            
    
    //scene 3
        Label Lives = new Label("Lives: ");
        VBox layout3= new VBox(20);
        layout3.getChildren().addAll(Lives);
        scene3 = new Scene(layout3,800,500);
    primaryStage.setScene(scene1);
    primaryStage.show();
    }
    
    public static void main(String[] args) {
    launch(args);
    }
        
    }
