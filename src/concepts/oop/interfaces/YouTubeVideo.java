package concepts.oop.interfaces;

public class YouTubeVideo implements Comparable <YouTubeVideo>, PrintSomething{

    private String title;
    private int numbOfLikes;


    public YouTubeVideo(String title, int numbOfLikes) {
        this.title = title;
        this.numbOfLikes = numbOfLikes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumbOfLikes() {
        return numbOfLikes;
    }

    public void setNumbOfLikes(int numbOfLikes) {
        this.numbOfLikes = numbOfLikes;
    }

    @Override
    public String toString() {
        return "YouTubeVideo{" +
                "title='" + title + '\'' +
                ", numbOfLikes=" + numbOfLikes +
                '}';
    }

    @Override
    public int compareTo(YouTubeVideo o) {
        return o.numbOfLikes - this.getNumbOfLikes();
    }

    @Override
    public void printSomethingNice() {
        System.out.println("Goated YouTube Video");
    }

    @Override
    public void printSomethingMean() {
        System.out.println("Troll Video. Jgl Gap");
    }
}
