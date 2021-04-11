package sample;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class music {
    public static void playMusic()
    {
        try {
            File musicpath =new File("Music\\PL.wav");
            if (musicpath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
                Clip clip= AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            else{
                System.out.println("can't find file");
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }
}
