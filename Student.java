package Tasks;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Hari");
        students.add("Harish");
        students.add("Deva");
        students.add("Mathu");
        students.add("Mythili");

        int randomIndex = (int) (Math.random() * students.size());


        System.out.println(" Student: " + students.get(randomIndex));
    }
}


