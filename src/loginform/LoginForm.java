package loginform;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author a47
 */
public class LoginForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       //LABLES
        Text uname_label=new Text("User Name"); 
        Text pass_label=new Text("Password");
        
        //TEXTFIELD
        TextField uname_tf=new TextField();
        
        //PASSWORDFIELD
         PasswordField pass_field = new PasswordField();
         
        //BUTTON
        Button login_button = new Button("Login"); 
        Button new_window_button = new Button("Open New Window");
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(uname_label,1,1);
        gridPane.add(pass_label,1,2);
        gridPane.add(uname_tf,2,1);
        gridPane.add(pass_field,2,2);        
        gridPane.add(login_button,2,3);
        gridPane.add(new_window_button,2,4);
        gridPane.setMinSize(600,300);        
        gridPane.setVgap(10);        
        gridPane.setHgap(20);        
        gridPane.setAlignment(Pos.CENTER);  
        
        //Event Handling for login (With the logins credentials)
        login_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {
        //Assume that the username & password are Joe and 12345 respectively
        String username = uname_tf.getText();
        String password = pass_field.getText();
        
        HomePage hp = new HomePage();
        
        if(username.equals("Nick") && password.equals("12345"))
        {
            //opening a new window
            hp.start(hp.HP_Stage);
        }
        else
        {
            // AN ALERT
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Wrong User Name or Password");
            a.show();   
        }
         
         } 
      })); 
        
        //Event handler for new_window_button (without the login credentials)
        new_window_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {        
            HomePage hp = new HomePage();
            hp.start(hp.HP_Stage);
         }
      })); 
        
        //SCENE
        Scene my_scene = new Scene(gridPane);
        
        //STAGE
        primaryStage.setScene(my_scene);
        primaryStage.setTitle("Login Page");
        primaryStage.show();
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}