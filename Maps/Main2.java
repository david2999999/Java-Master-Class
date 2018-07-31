package Maps;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        languages.remove("Lisp");

        if (languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. Key/value pair not found");
        }

        for (String key: languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
