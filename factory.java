package assign;

interface factory{
    void salary();
}


class Employer implements factory{
    public void salary() {
        System.out.println("Salary = 80,000");
    }
}

class Manager implements factory{
    public void salary(){
        System.out.println("Salary = 70,000");
    }
}

class Employee implements factory{
    public void salary() {
        System.out.println("Salary = 50,000");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Employer emp = new Employer();
        emp.salary();

        Manager mng=new Manager();
        mng.salary();

       
        Employee empl = new Employee();
        empl.salary();
    }
}
