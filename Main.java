import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
    // add any useful package line
    private static final Image SCENERY = new Image("desert.png" ,800,400,true,true);
    final private ImageView imageViewSceneryLeft = new ImageView(SCENERY);

    private Hero hero = new Hero(100,200,"heroes.png");
    ImageView heroSprite=hero.getSprite();

    private Camera cam = new Camera(0,0);
       public void start(Stage primaryStage){
           primaryStage.setTitle("Jeu");
           Group root = new Group();
           GameScene gs = new GameScene(root);

       }
        public static void main(String[] args) {
            launch(args);
            // write your code here
        }
}

