package Main;

public class Main {

    public static void main(String[] args) {
        User john = new User("John");
        User rob = new User("Rob");
        
        john.sendMessage("Hello, Rob!");
        rob.sendMessage("hi, john");
    }
}
