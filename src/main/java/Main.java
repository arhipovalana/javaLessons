import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

//        ProjectFunctions functions = new ProjectFunctions();
//
//        String text = functions.getWelcomeText("Valera");
//        System.out.println(text);

        String text = "Lorem Ipsum - is simply dummy text of the printing, and typesetting industry!";

        String[] words = text.split(" ");
        System.out.println("Word count is " + words.length);
//        System.out.println(words[4]);
        for (int i = 0; i < words.length; i = i + 2) {
            System.out.println("The word with id " + i + " is " + words[i]);
        }

        for (String word : words) {
            System.out.println(word);
        }

//        spiski

        List<String> names = new ArrayList<> ();
        names.add("Alexandra");
        names.add("Juel");
        names.add("Max");
        names.add("Upss Upss");

        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }

//        hashmap
        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry: bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()); // getvalue - vitashit value
        }
    }

}













