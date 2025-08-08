import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        student.put("satha", 7655);
        student.put("Harish", 3763);
        student.put("Bala", 9860);
        student.put("Raja", 864);
        System.out.println(student);
    }
}