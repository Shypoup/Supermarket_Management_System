
package employees.sales;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import static javafx.application.Application.launch;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Sales_Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sales.fxml"));
        
        Scene scene = new Scene(root);
        Image icon = new Image("/icons/my_account.png");
        stage.getIcons().add(icon);
        stage.setTitle("البيع");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
