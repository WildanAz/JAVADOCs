/**
 * The Calculator class provides basic arithmetic operations.
 * It includes methods for addition, subtraction, multiplication, and division.
 * <p>
 * Example usage:
 * <pre>
 *     Calculator calc = new Calculator();
 *     int result = calc.add(5, 3);
 * </pre>
 * </p>
 */
public class Kalkulator {

    /**
     * Adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     * Throws ArithmeticException if b is 0.
     *
     * @param a the first integer
     * @param b the second integer (divisor)
     * @return the result of dividing a by b
     * @throws ArithmeticException if b is 0
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}