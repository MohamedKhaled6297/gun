package guns;
import java.io.File;
import java.net.MalformedURLException;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.AudioClip;
public class play extends javax.swing.JFrame {
    JFXPanel j = new JFXPanel();
    URL url;
    static AudioClip b;
    public play() throws MalformedURLException {
        url= new URL("file:///C:/Users/basse/Documents/NetBeansProjects/guns/src/guns/BoxCat_Games_-_02_-_Mt_Fox_Shop.mp3");
        b = new AudioClip(url.toExternalForm());
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    sound so = new sound();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        sound = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        play.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        play.setText("play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(106, 152, 459, 57);

        sound.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        sound.setText("sound");
        sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundActionPerformed(evt);
            }
        });
        getContentPane().add(sound);
        sound.setBounds(106, 249, 459, 57);

        exit.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(106, 350, 459, 57);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUNS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 549, 112);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -20, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guns/video-game-wallpapers-8230-8563-hd-wallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        new Anim();
        this.dispose();
        try{
            
            JFXPanel j = new JFXPanel();
            b.stop();
            URL url;
            url = new URL("file:///C:/Users/basse/Documents/NetBeansProjects/guns/src/guns/BoxCat_Games_-_03_-_Battle_Special.mp3");
            AudioClip a = new AudioClip(url.toExternalForm());
            a.setVolume(1);
            a.play();
        }
        catch(Exception ex){
            System.out.println(ex);
        }

    }//GEN-LAST:event_playActionPerformed

    private void soundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundActionPerformed
        new sound().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_soundActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                play p;
                try {
                    p = new play();
                    p.setVisible(true);
                    b.setVolume(1);
                    b.play();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
        
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton play;
    private javax.swing.JButton sound;
    // End of variables declaration//GEN-END:variables
}
