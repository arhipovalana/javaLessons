public class Main {
    public static void main (String[] args) {
        System.out.println("Hello, world!");

        ProjectFunctions functions = new ProjectFunctions();

        String text = functions.getWelcomeText("Valera");
        System.out.println(text);
    }
}
