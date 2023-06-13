
public class DebugActivity {

    public static int divideNumbers(int a, int b) {
        return a / b;

    }

    public static void main(String[] args) {
        System.out.println("hello");
        int x = 5;
        int y = 0;
        System.out.println("Starting the program...");

        // figure out how to "catch" the "divide by zero" error, don 't just change the value on "y"
        try {
            int result = divideNumbers(x, y);

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");

            String name = "John";
            int length = name.length();
            System.out.println("Length of name: " + length);

            int[] numbers = {1, 2, 3, 4, 5};
            for (int number : numbers) {
//                for loop should print one number each iteration
                System.out.println(number);
            }

            String[] fruits = {"Apple", "Banana", "Orange"};
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            System.out.println("End of the program.");
        }

    }
}
