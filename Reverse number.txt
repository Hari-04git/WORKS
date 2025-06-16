public class Reverese  {
    public static void main(String[] args) {
        int num =10022423;
        int i = 0;

        while (num != 0) {
            int digit = num % 10;
            i = i * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + i);
    }
}
