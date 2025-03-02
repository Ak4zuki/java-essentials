package concepts.oop.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Interface {
    public static void main(String[] args) {

        YouTubeVideo a = new YouTubeVideo("How To Make Your Own Google Search", 2400);
        YouTubeVideo b = new YouTubeVideo("Is Computer Science Still Worth It?", 18000);
        YouTubeVideo c = new YouTubeVideo("How To Use AI Before It Uses You?", 6100);

        ArrayList<YouTubeVideo> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        a.printSomethingNice();
        a.printSomethingMean();
    }
}