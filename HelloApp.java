public class HelloApp {
    public static void main(String[] args) {

        // UC1: If no argument → print Hello World
        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        // UC2: If argument exists → print personalized greeting
        else {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
    }
}