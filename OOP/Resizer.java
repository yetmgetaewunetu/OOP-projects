import javax.swing.ImageIcon;
import java.awt.*;

public class Resizer {
    public static ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
}
}
