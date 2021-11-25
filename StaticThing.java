import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private double x;
    private double y;
    private ImageView imageStatic;

    public StaticThing(double x, double y, String fileName) {
        this.x = x;
        this.y = y;
        final Image image1 = new Image(fileName);
        ImageView image = new ImageView(image1);
        this.imageStatic=image;
    }

    public double getX() {
        return x;
    }

    public ImageView getImageStatic() {
        return imageStatic;
    }
}
