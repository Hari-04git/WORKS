package Tasks;

interface Student {
    void playing();
}
class CollegeStudent extends Student {
    public void study() {
        System.out.println("The  student is playing Badminton");
    }
}
    public class Main {
    public static void main(String[] args) {
        Student s = new CollegeStudent();
        s.playing();
    }
}
