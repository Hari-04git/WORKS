package Tasks;

interface student {
    void playing();
}

class CollegeStudent implements student {
    public void playing() {
        System.out.println("The student is playing Badminton");
    }
}

public class Main {
    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();
        s.playing();
    }
}