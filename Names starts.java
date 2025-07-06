package Tasks;

import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Aravind");
        names.add("Arav");
        names.add("Arjun");
        names.add("Satha");
        names.add("Harish");
        names.add("Arana");

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}

