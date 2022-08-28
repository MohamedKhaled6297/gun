
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;


/**
 *
 * @author basse
 */
public class c {
    public static void main(String[]args){
        JFXPanel j = new JFXPanel();
            String uri = new File("001.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
            JOptionPane.showMessageDialog(null, uri);
    }
}
