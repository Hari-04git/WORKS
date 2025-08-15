import java.util.ArrayList;
import java.util.Iterator;

public class Voter {
    private String name;
    private String id;

    
    public Voter(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        ArrayList<Voter> voters = new ArrayList<>();

        voters.add(new Voter("Karan", "1"));
        voters.add(new Voter("Harish", "2"));
        voters.add(new Voter("Satha", "3"));

        Iterator<Voter> it = voters.iterator();
        while (it.hasNext()) {
            Voter voter = it.next();
            System.out.println(voter.getName());
        }
    }
}
