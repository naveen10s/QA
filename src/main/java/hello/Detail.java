package hello;

public class Detail {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Getting a String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Getting an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Getting a floating-point input
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Getting a boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        // Close the scanner when done
        scanner.close();
    }
}
