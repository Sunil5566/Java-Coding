import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class A4_AudioPlayer {
    public static void main(String[] args) {
        try {
            File file = new File("Level_up.wav"); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Keep program running so the sound plays fully
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
