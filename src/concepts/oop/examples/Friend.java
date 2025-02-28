package concepts.oop.examples;

public class Friend {

    static int numOfFriends;
    String name;

    public Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    public static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
