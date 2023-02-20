import java.util.Scanner;

public class CreateInputExample {
    public static void main(String[] args) {

        String name;
        byte age;
        String job;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = keyboard.nextLine();

        System.out.println(name + ", Enter your age: ");
        age = keyboard.nextByte();
        keyboard.nextLine();

        System.out.println("What is your job tittle: ");
        job = keyboard.nextLine();

        System.out.println("Your name is " + name + " and your age is " + age);
        System.out.println("Your Job Tittle is " + job);

    }
}
