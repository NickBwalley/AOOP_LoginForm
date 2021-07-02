package loginform;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author a47
 */
public class HomePage extends Application{
    
    Stage HP_Stage = new Stage();
    
    @Override
    public void start(Stage primaryStage) {
       //LABLES
        Text welcome_label=new Text("WELCOME TO SHOP MR.BEAST!"); 
        
        Button close_button = new Button("Close"); 
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
      
        gridPane.add(welcome_label,0,0);
        gridPane.add(close_button,0,1);
        gridPane.setMinSize(500,250);        
        gridPane.setVgap(10);        
        gridPane.setHgap(20);        
        gridPane.setAlignment(Pos.CENTER);
        
       //Event Handler for the close button
        close_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) { 
          Stage stage = (Stage) close_button.getScene().getWindow();            
          stage.close();             
         } 
      }));
       
        
        //SCENE
        Scene my_scene = new Scene(gridPane);
        
        //STAGE
        primaryStage.setScene(my_scene);
        primaryStage.setTitle("WELCOME TO MR.BEAST SHOP!");
        primaryStage.show();
        
    }
}
