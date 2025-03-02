package alarmclock;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "Linkin Park - Heavy Is the Crown (Lyrics).mp3";

        String inputTime;

        while (alarmTime == null) {
            try {
                System.out.print("Enter Alarm Time (HH:mm:ss): ");
                inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm Set For: " + alarmTime);
            } catch (DateTimeException e) {
                System.out.println("Invalid Format. \nPlease Use HH:mm:ss");
            }
        }
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}