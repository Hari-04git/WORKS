public class Person {
    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
             
            Person other = (Person) obj;

            return 
            this.name.equals(other.name) &&
            this.number == other.number;
}
        
            return false;
}
   

    public static void main(String[] args) {
        Person p1 = new Person("satha", 78);
        Person p2 = new Person("satha", 78);
        Person p3 = new Person("harish", 456);
        Person p4 = new Person("Bala" , 456);

        System.out.println(p1.equals(p2)); 
        System.out.println(p2.equals(p3)); 
        System.out.println(p3.equals(p4));
    }
}
 