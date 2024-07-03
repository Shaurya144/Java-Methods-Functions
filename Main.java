public class Main {
    // A Method is also known as a function
    // they save time and stop you from repeating code

    static void MyMethod() {
        System.out.println("Code Worked!!");
    }

    public static void main(String[] args) {
        // to call a method
        MyMethod();

        // and to access parameters using
        Adding(25, 15);

        int result = Factorial(5);
        System.out.println("The Factorial of 5 is : " + result);
    }

    // They also take data that you can use in the function
    static void Adding(int number1, int number2) {
        int answer = number1 + number2;
        System.out.println("When you add " + number1 + " and " + number2 + " you get: " + answer + ".");
    }

    // When a parameter is passed to the method, it is called an argument

    // we use void to say the function does not return anything
    // if you want it to return a value you just add the data type of that result
    // instead of void
    // Methods can have the same name as long as they return different data types
    // In Java variables declared inside a public bracket thing cannot be accessed
    // out side of it

    // Eg.
    /*
     * 
     * public class Main {
     * public static void main(String[] args) {
     * 
     * // Code here CANNOT use x
     * 
     * { // This is a block
     * 
     * // Code here CANNOT use x
     * 
     * int x = 100;
     * 
     * // Code here CAN use x
     * System.out.println(x);
     * 
     * } // The block ends here
     * 
     * // Code here CANNOT use x
     * }
     * }
     */
    // Simply put variable cannot be edited or used before it is even initialised
    // or outside the block it was initialised in

    // Recursion is the technique of making a function call itself.
    // This technique provides a way to break complicated problems down into simple
    // problems which are easier to solve.
    public static int Factorial(int k) {
        if (k > 1) {
            return k * Factorial(k - 1);
        } else {
            return 3;
        }
    }
}