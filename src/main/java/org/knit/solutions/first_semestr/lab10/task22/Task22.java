import org.knit.solutions.first_semestr.lab10.task22.Dictionary;

public class Task22 {
    public static void execute(){
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        dictionary.put("Alice", 25);
        dictionary.put("Bob", 30);
        System.out.println(dictionary.getValue("Alice"));
        System.out.println(dictionary.getValue("Bob"));
        System.out.println(dictionary.keys());
        dictionary.remove("Bob");
        System.out.println(dictionary.keys());
    }
}
