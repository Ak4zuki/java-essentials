package alarmclock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                int hours = now.getHour();
                int minutes = now.getMinute();
                int second = now.getSecond();

                System.out.printf("\r%02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread Was Interrupted");
            }
        }
        playAudio(filePath);
    }

    private void playAudio(String filePath) {

        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press ENTER To Stop Alarm: ");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("\nAudio File Format Not Supported");
        } catch (LineUnavailableException e) {
            System.out.println("\nAudio Not Acceptable");
        } catch (IOException e) {
            System.out.println("\nError Reading Audio File");
        }
    }
}